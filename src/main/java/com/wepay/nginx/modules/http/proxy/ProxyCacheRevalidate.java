/********************************************************** 
* Syntax: proxy_cache_revalidate on | off;
* Default: proxy_cache_revalidate off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheRevalidate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCacheRevalidate() {
		super(contexts, "off", "proxy_cache_revalidate");
	}

}
