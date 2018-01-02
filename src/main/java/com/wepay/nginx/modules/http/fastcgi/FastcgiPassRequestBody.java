/********************************************************** 
* Syntax: fastcgi_pass_request_body on | off;
* Default: fastcgi_pass_request_body on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiPassRequestBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiPassRequestBody() {
		super(contexts, "on", "fastcgi_pass_request_body");
	}

}
