/********************************************************** 
* Syntax: proxy_intercept_errors on | off;
* Default: proxy_intercept_errors off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyInterceptErrors extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyInterceptErrors() {
		super(contexts, "off", "proxy_intercept_errors");
	}

}
