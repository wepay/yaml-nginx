/********************************************************** 
* Syntax: proxy_cache_methods GET | HEAD | POST ...;
* Default: proxy_cache_methods GET HEAD;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheMethods extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCacheMethods() {
		super(contexts, "GET HEAD", "proxy_cache_methods");
	}

}
