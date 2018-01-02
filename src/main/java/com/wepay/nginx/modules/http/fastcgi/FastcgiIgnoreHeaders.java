/********************************************************** 
* Syntax: fastcgi_ignore_headers field ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiIgnoreHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiIgnoreHeaders() {
		super(contexts, null, "fastcgi_ignore_headers");
	}

}
