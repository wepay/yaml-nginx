/********************************************************** 
* Syntax: uwsgi_cache_lock on | off;
* Default: uwsgi_cache_lock off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheLock extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiCacheLock() {
		super(contexts, "off", "uwsgi_cache_lock");
	}

}
