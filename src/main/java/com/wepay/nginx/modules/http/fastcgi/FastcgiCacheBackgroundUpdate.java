/********************************************************** 
* Syntax: fastcgi_cache_background_update on | off;
* Default: fastcgi_cache_background_update off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCacheBackgroundUpdate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiCacheBackgroundUpdate() {
		super(contexts, "off", "fastcgi_cache_background_update");
	}

}
