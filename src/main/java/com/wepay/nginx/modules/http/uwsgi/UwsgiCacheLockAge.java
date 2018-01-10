/********************************************************** 
* Syntax: uwsgi_cache_lock_age time;
* Default: uwsgi_cache_lock_age 5s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheLockAge extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiCacheLockAge() {
		super(contexts, "5s", "uwsgi_cache_lock_age");
	}

}
