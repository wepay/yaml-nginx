/********************************************************** 
* Syntax: uwsgi_cache_bypass string ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheBypass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiCacheBypass() {
		super(contexts, null, "uwsgi_cache_bypass");
	}

}
