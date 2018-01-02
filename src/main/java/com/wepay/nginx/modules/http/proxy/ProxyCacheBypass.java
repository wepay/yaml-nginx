/********************************************************** 
* Syntax: proxy_cache_bypass string ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheBypass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCacheBypass() {
		super(contexts, null, "proxy_cache_bypass");
	}

}
