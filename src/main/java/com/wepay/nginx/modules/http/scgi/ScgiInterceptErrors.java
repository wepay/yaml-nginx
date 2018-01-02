/********************************************************** 
* Syntax: scgi_intercept_errors on | off;
* Default: scgi_intercept_errors off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiInterceptErrors extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiInterceptErrors() {
		super(contexts, "off", "scgi_intercept_errors");
	}

}
