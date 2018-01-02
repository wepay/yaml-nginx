/********************************************************** 
* Syntax: fastcgi_keep_conn on | off;
* Default: fastcgi_keep_conn off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiKeepConn extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiKeepConn() {
		super(contexts, "off", "fastcgi_keep_conn");
	}

}
