/********************************************************** 
* Syntax: fastcgi_request_buffering on | off;
* Default: fastcgi_request_buffering on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiRequestBuffering extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiRequestBuffering() {
		super(contexts, "on", "fastcgi_request_buffering");
	}

}
