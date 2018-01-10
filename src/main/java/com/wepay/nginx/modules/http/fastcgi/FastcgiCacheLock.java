/********************************************************** 
* Syntax: fastcgi_cache_lock on | off;
* Default: fastcgi_cache_lock off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCacheLock extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiCacheLock() {
		super(contexts, "off", "fastcgi_cache_lock");
	}

}
