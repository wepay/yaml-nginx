/********************************************************** 
* Syntax: uwsgi_intercept_errors on | off;
* Default: uwsgi_intercept_errors off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiInterceptErrors extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiInterceptErrors() {
		super(contexts, "off", "uwsgi_intercept_errors");
	}

}
