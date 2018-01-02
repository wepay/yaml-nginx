/********************************************************** 
* Syntax: fastcgi_pass_request_headers on | off;
* Default: fastcgi_pass_request_headers on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiPassRequestHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiPassRequestHeaders() {
		super(contexts, "on", "fastcgi_pass_request_headers");
	}

}
