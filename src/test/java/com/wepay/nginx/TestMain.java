package com.wepay.nginx;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.wepay.nginx.Constants;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.helper.NginxHelper;

public class TestMain {

	@Test
	public void testDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/main.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/main_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "main");
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
	public void testNginxDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/main_nginx.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/main_nginx_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "main");
			List<String> expected = NginxHelper.getAsList(res_filename);
			List<String> resList = (List) Arrays.asList(res.split("\n"));
			System.out.println(res);
			assertEquals(expected.size(),resList.size());
			assertTrue(resList.containsAll(expected));
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}  
	
	}

	@Test
	public void testSimpleDumps() {
		String filename = Constants.TEST_RESOURCE_PATH + "/main_simple.yml";
		String res_filename = Constants.TEST_RESOURCE_PATH + "/main_simple_result.yml";
		String res;
		try {
			res = NginxFormatter.formatFile(filename, "main");
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
