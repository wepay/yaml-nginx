/********************************************************** 
* Syntax: proxy_cache_lock on | off;
* Default: proxy_cache_lock off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheLock extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyCacheLock() {
		super(contexts, "off", "proxy_cache_lock");
	}

}
