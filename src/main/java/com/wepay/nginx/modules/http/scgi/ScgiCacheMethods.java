/********************************************************** 
* Syntax: scgi_cache_methods GET | HEAD | POST ...;
* Default: scgi_cache_methods GET HEAD;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheMethods extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiCacheMethods() {
		super(contexts, "GET HEAD", "scgi_cache_methods");
	}

}
