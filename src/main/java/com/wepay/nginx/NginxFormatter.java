package com.wepay.nginx;

import com.wepay.nginx.exceptions.InvalidArgumentException;
import com.wepay.nginx.helper.NginxHelper;
import com.wepay.nginx.modules.core.Main;
import com.wepay.nginx.modules.http.core.Http;
import com.wepay.nginx.modules.http.core.Location;
import com.wepay.nginx.modules.http.core.Server;

public class NginxFormatter {

	public static String format(String filename, String context) throws Exception {
		if(context==null || context.trim().isEmpty() || filename==null ||filename.trim().isEmpty()){
			throw new InvalidArgumentException();
		}
		NginxHelper ngnx=new NginxHelper();
		Class cls=null;
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
		Dumps dumpObj=ngnx.parse(filename, cls);
		return dumpObj.dump(0);
	}
}
