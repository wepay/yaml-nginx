package com.wepay.nginx;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wepay.nginx.Constants;
import com.wepay.nginx.IDumps;
import com.wepay.nginx.helper.NginxHelper;

public class TestServer {

	@Test
	public void testDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/server.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/server_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "server");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			assertEquals(expected.size(), resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testSimpleDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/server_simple.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/server_simple_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "server");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			assertEquals(expected.size(), resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testLocationDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/server_location.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/server_location_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "server");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			assertEquals(expected.size(), resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
}
