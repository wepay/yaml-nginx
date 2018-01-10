/********************************************************** 
* Syntax: fastcgi_cache_lock_age time;
* Default: fastcgi_cache_lock_age 5s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCacheLockAge extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiCacheLockAge() {
		super(contexts, "5s", "fastcgi_cache_lock_age");
	}

}
