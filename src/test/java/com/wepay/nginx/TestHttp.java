package com.wepay.nginx;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wepay.nginx.Constants;

public class TestHttp {
	//@Test
	public void testDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/http.yml";
		String expected = "---Z0----\nhttp {\n    include                   /etc/nginx/conf.d/*;\n    ---A----\n    server {\n        ---B----\n        location /home/dist {\n            open_file_cache_errors    on;\n        }\n        ---B----\n        location /home/dist/latest {\n            open_file_cache_errors    off;\n        }\n        open_file_cache_errors    skjdhjkfh;\n        server_name               Roopa;\n        ---C----\n        server_name_in_redirect   off;\n        ---C----\n    }\n    ---A----\n    ---Z1----\n    server {\n        ---B----\n        location /home/dist {\n            open_file_cache_errors    on;\n        }\n        ---B----\n        location /home/dist/latest {\n            include                   /etc/nginx/conf.d/*;\n            open_file_cache_errors    off;\n        }\n        server_name               server1;\n    }\n    ---Z1----\n    ---Z2----\n    server {\n        location /home/dist {\n            include                   /hom/nginx/conf.d/*;\n            include                   /etc/nginc/conf.d/*;\n            open_file_cache_errors    on;\n        }\n        location /home/dist/latest {\n            open_file_cache_errors    off;\n        }\n        server_name               server2;\n    }\n    ---Z2----\n}\n---Z0 ----\n";
		try {
			String res = NginxFormatter.format(filename, "http");
			//assertEquals(res, expected);
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
	@Test
	public void testVhostDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/http_vhost.yml";
		String expected = "";
		try {
			String res = NginxFormatter.format(filename, "http");
			System.out.println(res);
			//assertEquals(res, expected); 
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
}