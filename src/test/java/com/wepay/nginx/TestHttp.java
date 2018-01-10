package com.wepay.nginx;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wepay.nginx.Constants;
import com.wepay.nginx.exceptions.InvalidArgumentException;
import com.wepay.nginx.helper.NginxHelper;
 
import java.io.IOException;
import java.util.*;

public class TestHttp {

	@Test
	public void testDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/http.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/http_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "http");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			assertEquals(expected.size(),resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}  
	}


	@Test
	public void testVhostDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/http_vhost.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/http_vhost_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "http");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			assertEquals(expected.size(),resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}  
	}

	@Test
	public void testbasicHttpDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/http_basic.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/http_basic_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "http");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			assertEquals(expected.size(),resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}  
	}
	@Test
	public void testvhost2HttpDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/http_vhost2.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/http_vhost2_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "http");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			assertEquals(expected.size(),resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}  
	}
}