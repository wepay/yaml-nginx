package com.wepay.nginx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.wepay.nginx.helper.NginxHelper;

public class TestServers {
	@Test
	public void testDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/servers.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/servers_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "http");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			System.out.println(res);
			assertEquals(expected.size(), resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
}
