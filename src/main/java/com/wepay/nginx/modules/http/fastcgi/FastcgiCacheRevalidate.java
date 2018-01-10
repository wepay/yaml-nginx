/********************************************************** 
* Syntax: fastcgi_cache_revalidate on | off;
* Default: fastcgi_cache_revalidate off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCacheRevalidate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiCacheRevalidate() {
		super(contexts, "off", "fastcgi_cache_revalidate");
	}

}
