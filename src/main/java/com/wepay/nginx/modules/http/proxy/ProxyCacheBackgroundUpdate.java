/********************************************************** 
* Syntax: proxy_cache_background_update on | off;
* Default: proxy_cache_background_update off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheBackgroundUpdate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCacheBackgroundUpdate() {
		super(contexts, "off", "proxy_cache_background_update");
	}

}
