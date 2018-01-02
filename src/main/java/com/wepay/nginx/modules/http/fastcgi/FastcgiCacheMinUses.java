/********************************************************** 
* Syntax: fastcgi_cache_min_uses number;
* Default: fastcgi_cache_min_uses 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCacheMinUses extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiCacheMinUses() {
		super(contexts, "1", "fastcgi_cache_min_uses");
	}

}
