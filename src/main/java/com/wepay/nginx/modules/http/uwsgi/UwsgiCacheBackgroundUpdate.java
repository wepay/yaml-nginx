/********************************************************** 
* Syntax: uwsgi_cache_background_update on | off;
* Default: uwsgi_cache_background_update off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheBackgroundUpdate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiCacheBackgroundUpdate() {
		super(contexts, "off", "uwsgi_cache_background_update");
	}

}
