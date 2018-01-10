/********************************************************** 
* Syntax: uwsgi_cache_min_uses number;
* Default: uwsgi_cache_min_uses 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheMinUses extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiCacheMinUses() {
		super(contexts, "1", "uwsgi_cache_min_uses");
	}

}
