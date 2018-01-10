/********************************************************** 
* Syntax: fastcgi_cache_key string;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCacheKey extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiCacheKey() {
		super(contexts, null, "fastcgi_cache_key");
	}

}
