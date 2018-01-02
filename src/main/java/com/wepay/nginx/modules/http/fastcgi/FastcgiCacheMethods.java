/********************************************************** 
* Syntax: fastcgi_cache_methods GET | HEAD | POST ...;
* Default: fastcgi_cache_methods GET HEAD;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCacheMethods extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiCacheMethods() {
		super(contexts, "GET HEAD", "fastcgi_cache_methods");
	}

}
