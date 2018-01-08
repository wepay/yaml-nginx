package com.wepay.nginx;

import static com.wepay.nginx.Constants.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;
import com.wepay.nginx.helper.NginxHelper;
import com.wepay.nginx.modules.core.Include;
import com.wepay.nginx.modules.http.core.Includes;

public abstract class Context extends NginxAbstractClass {
	private Map<String, Dumps> map;

	@JsonProperty("includes")
	private Includes includes;

	@JsonProperty("include")
	private Include include;

	@JsonProperty("comment")
	protected Comment comment;

	@JsonProperty("name")
	private Name name;

	public Includes getIncludes() {
		return includes;
	}

	public void setIncludes(Includes includes) {
		this.includes = includes;
	}

	public Include getInclude() {
		return include;
	}

	public void setInclude(Include include) {
		this.include = include;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Context(List contexts, String defaultVal, String classAnnotation) {
		super(contexts, defaultVal, classAnnotation);
		map = new LinkedHashMap<String, Dumps>();
	}

	public Map<String, Dumps> getMap() {
		if (map.size() == 0) {
			map.put("include", include);
			map.put("includes", includes);
		}
		return map;
	}

	public void setMap(Map<String, Dumps> map) {
		this.map = map;
	}

	abstract public void populateMap();

	public String dump(int level, String ctx)throws InvalidConditionDirectiveException  {
		populateMap();
		StringBuilder sb = new StringBuilder();
		Map<String, Dumps> map = getMap();
		int strlen=0;
		for (String key : map.keySet()) {
			if(map.get(key)!=null && key.length()>strlen){
				strlen=key.length();
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) instanceof Directive) {
				Directive directive = (Directive) map.get(key);
				directive.setFormatLength(strlen);
				sb.append(directive.dump(level, ctx));
			} else if (map.get(key) instanceof Context) {
				Context context = (Context) map.get(key);
				sb.append(context.dump(level, ctx));
			} else if (map.get(key) instanceof List) {
				Dumps dumps = (Dumps) map.get(key);
				sb.append(dumps.dump(level, ctx));
			}
		}
		return sb.toString();
	}

//	public String updateConditionBlock(int level, String str) throws InvalidConditionDirectiveException {
//		String s = str;
//		if (conditionStart != null && !conditionStart.getValue().trim().isEmpty()) {
//			if (conditionEnd == null || conditionEnd.getValue().trim().isEmpty()) {
//				throw new InvalidConditionDirectiveException();
//			} else {
//				String pre = NginxHelper.getSpace(level);
//				s = String.format(CONTEXT_PRINT_FORMAT_CONDITION, pre, conditionStart.getValue(), str, pre,
//						conditionEnd.getValue());
//			}
//		}
//		return updateComment(level,s);
//	}

	@Override
	public String getComment() {
		if (comment != null) {
			return comment.getValue();
		}
		return null;
	}
}
