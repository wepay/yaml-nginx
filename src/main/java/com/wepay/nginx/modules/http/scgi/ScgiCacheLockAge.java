/********************************************************** 
* Syntax: scgi_cache_lock_age time;
* Default: scgi_cache_lock_age 5s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheLockAge extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiCacheLockAge() {
		super(contexts, "5s", "scgi_cache_lock_age");
	}

}
