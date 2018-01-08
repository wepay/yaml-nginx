package com.wepay.nginx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.FileReader;
import java.util.Map;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.wepay.nginx.modules.http.core.Location;
import com.wepay.nginx.modules.http.rewrite.Rewrite;
import com.wepay.nginx.modules.http.rewrite.Rewrites;

public class TestRewrites {
	@Test
	public void testVhostDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/rewrites.yml";
		String expected = "rewrite ^/$  https://{{ marketing_domain }}/  permanent;\nrewrite ^/$  https://{{ marketing_domain }}/  permanent;\n";
		try {
			Yaml yaml = new Yaml();
			Map<String, Object> mapObj;
			mapObj = (Map<String, Object>) yaml.load(new FileReader(filename));
			String s = yaml.dump(mapObj);
			final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			Dumps dps= (Dumps)mapper.readValue(s, Location.class);
			String res=dps.dump(0, "location");
			assertEquals(res, expected); 
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
}
