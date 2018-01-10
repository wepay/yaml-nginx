package com.wepay.nginx;

import org.junit.Test;

import com.wepay.nginx.helper.NginxHelper;
import com.wepay.nginx.modules.http.core.Server;

public class TestNginxHelper {
	@Test
	public void testPopulatelinkingMapCode() {
		Server server = new Server();
		NginxHelper.populatelinkingMapCode(server, Server.class);
	}
}
