package com.wepay.nginx;

import java.io.IOException;

import com.wepay.nginx.exceptions.InvalidArgumentException;
import com.wepay.nginx.helper.NginxHelper;
import com.wepay.nginx.modules.core.Main;
import com.wepay.nginx.modules.http.core.Http;
import com.wepay.nginx.modules.http.core.Location;
import com.wepay.nginx.modules.http.core.Server;

public class NginxFormatter {

	public static String formatFile(String filename, String context) throws InvalidArgumentException, IOException {
		if (context == null || context.trim().isEmpty() || filename == null || filename.trim().isEmpty()) {
			throw new InvalidArgumentException();
		}
		NginxHelper ngnx = new NginxHelper();
		Class cls = getContextClass(context);
		IDumps dumpObj = ngnx.parseFromFile(filename, cls);
		return dumpObj.dump(0, context);
	}

	public static String formatString(String str, String context) throws InvalidArgumentException, IOException {
		if (context == null || context.trim().isEmpty() || str == null || str.trim().isEmpty()) {
			throw new InvalidArgumentException();
		}
		NginxHelper ngnx = new NginxHelper();
		Class cls = getContextClass(context);
		IDumps dumpObj = ngnx.parseFromString(str, cls);
		return dumpObj.dump(0, context);
	}

	/**
	 * @param context
	 * @return
	 * @throws InvalidArgumentException
	 */
	private static Class getContextClass(String context) throws InvalidArgumentException {
		Class cls = null;
		switch (context.toLowerCase()) {
		case "server":
			cls = Server.class;
			break;
		case "locations":
			cls = Location.class;
			break;
		case "http":
			cls = Http.class;
			break;
		case "main":
			cls = Main.class;
			break;
		default:
			throw new InvalidArgumentException("context should be one of 'server', 'http', 'location' or 'main'. ");
		}
		return cls;
	}
}
