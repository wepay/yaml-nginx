package com.wepay.nginx;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wepay.nginx.Constants;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.helper.NginxHelper;

public class TestServer {

	@Test
	public void testDumps() {
		String expected="---A----\nserver {\n    if ($request_method = GET) {\n        return                    500;\n    }\n    if ($request_method = POST) {\n         break;\n        return                    200;\n    }\n    ---B----\n    location /home/dist {\n        open_file_cache_errors    on;\n    }\n    ---B----\n    location /home/dist/latest {\n        open_file_cache_errors    off;\n    }\n    open_file_cache_errors    skjdhjkfh;\n    server_name               Roopa;\n    ---C----\n    server_name_in_redirect   off;\n    ---C----\n}\n---A----\n";
		String filename = Constants.TEST_RESOURCE_PATH + "/server.yml";
		try {
			ObjectMapper m;
			String res = NginxFormatter.format(filename, "server");
			assertEquals(res, expected);
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testSimpleDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/server_simple.yml";
		String expected = "server {\n    open_file_cache_errors    skjdhjkfh;\n    server_name               Roopa;\n    server_name_in_redirect   off;\n}\n";
		try {
			String res = NginxFormatter.format(filename, "server");
			assertEquals(res, expected);
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
	@Test
	public void testLocationDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/server_location.yml";
		String expected = "---A----\nserver {\n    ---B----\n    location /home/dist {\n        open_file_cache_errors    on;\n    }\n    ---B----\n    location /home/dist/latest {\n        open_file_cache_errors    off;\n    }\n    open_file_cache_errors    skjdhjkfh;\n    server_name               Roopa;\n    ---C----\n    server_name_in_redirect   off;\n    ---C----\n}\n---A----\n";
		try {
			String res = NginxFormatter.format(filename, "server");
			assertEquals(res, expected); 
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
}
 