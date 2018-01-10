/********************************************************** 
* Syntax: proxy_cache_min_uses number;
* Default: proxy_cache_min_uses 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheMinUses extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyCacheMinUses() {
		super(contexts, "1", "proxy_cache_min_uses");
	}

}
