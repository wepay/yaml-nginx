/********************************************************** 
* Syntax: proxy_cache_key string;
* Default: proxy_cache_key $scheme$proxy_host$request_uri;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheKey extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCacheKey() {
		super(contexts, "$scheme$proxy_host$request_uri", "proxy_cache_key");
	}

}
