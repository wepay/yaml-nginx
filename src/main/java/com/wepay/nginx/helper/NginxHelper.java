package com.wepay.nginx.helper;

import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.wepay.nginx.NginxAbstractClass;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;
import com.wepay.nginx.Constants;
import com.wepay.nginx.Dumps; 

public class NginxHelper {
	public Dumps parseFromFile(String filename, Class cls) throws InvalidConditionDirectiveException, JsonParseException, JsonMappingException, IOException {
		Yaml yaml = new Yaml();
		Map<String, Object> mapObj;
		mapObj = (Map<String, Object>) yaml.load(new FileReader(filename));
		return generateObject(cls, yaml, mapObj);
	}
	public Dumps parseFromString(String str, Class cls) throws InvalidConditionDirectiveException, JsonParseException, JsonMappingException, IOException {
		Yaml yaml = new Yaml();
		Map<String, Object> mapObj;
		mapObj = (Map<String, Object>) yaml.load(str);
		return generateObject(cls, yaml, mapObj);
	}
	/**
	 * @param cls
	 * @param yaml
	 * @param mapObj
	 * @return
	 * @throws IOException
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 */
	private Dumps generateObject(Class cls, Yaml yaml, Map<String, Object> mapObj)
			throws IOException, JsonParseException, JsonMappingException {
		for (String key : mapObj.keySet()) {
			enhanceMap(mapObj, key);
		}
		String s = yaml.dump(mapObj);
		//System.out.println(s);
		final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		return (Dumps)mapper.readValue(s, cls);
	}
	public static void populatelinkingMapCode(Object obj, Class<? extends NginxAbstractClass> c){
		 Class<? extends Annotation> ann = JsonProperty.class;
	      System.out.println("Map<String, Dumps> map = new HashMap<String, Dumps>();");
	      System.out.println("//map.clear();");
			for (Field field : c.getDeclaredFields()) {
				if (field.isAnnotationPresent(ann)) {     
					JsonProperty a = (JsonProperty) field.getAnnotation(ann);
					System.out.println("map.put(\""+a.value()+"\", "+field.getName()+");");}
					/*
					Class<?> var = field.getType();
					Class[] argTypes = new Class[] { Integer.class };
					Method m;
					try {
						if (!var.isPrimitive()) {
							Method[] methods = var.getDeclaredMethods();
							for (Method method : methods) {
								System.out.println(method.getName());
								if (method.getName().equals("dump")) {
									method.setAccessible(true);
									OpenFileCacheErrors err = new OpenFileCacheErrors();
									System.out.println(method.invoke(err, 2));
								}
							}

						}
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
			 
			 
		} 
	}

	private void enhanceMap(Map<String, Object> load, String key) {
		if (load != null) {
			if (load.get(key) instanceof Map) {
				Map<String, Object> m = (Map<String, Object>) load.get(key);
				{
					if (m.get(Constants.VALUE_STR) == null)
					{	 
						for (String k : m.keySet()) {
							enhanceMap(m, k);
						}
					}
				}
			} else if (load.get(key) instanceof List) {
				List<Map<String, Object>> l = (List<Map<String, Object>>) load.get(key);
				for (Map<String, Object> o : l) {
					if (o.get(Constants.VALUE_STR) == null)
					{
						for (String k : o.keySet()) {
							enhanceMap(o, k);
						}
					}
				}
			} else {
				Object tmp = load.get(key);
				Map<String, Object> map1 = new HashMap<String, Object>();
				map1.put(Constants.VALUE_STR, tmp);
				load.put(key, map1);
			}
		}

	}
	static public String getSpace(int level) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < level * Constants.SPACE_COUNT; i++) {
			sb.append(Constants.SPACE);
		}
		return sb.toString();
	}

 
	static public String getTab(int level) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < level * Constants.TAB_COUNT; i++) {
			sb.append(Constants.TAB);
		}
		return sb.toString();
	}
}
