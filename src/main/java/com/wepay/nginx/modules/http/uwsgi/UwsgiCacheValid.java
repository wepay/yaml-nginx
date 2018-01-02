/********************************************************** 
* Syntax: uwsgi_cache_valid [code ...] time;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheValid extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiCacheValid() {
		super(contexts, null, "uwsgi_cache_valid");
	}

}
