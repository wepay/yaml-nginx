/********************************************************** 
* Syntax: fastcgi_intercept_errors on | off;
* Default: fastcgi_intercept_errors off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiInterceptErrors extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiInterceptErrors() {
		super(contexts, "off", "fastcgi_intercept_errors");
	}

}
