/********************************************************** 
* Syntax: proxy_cache zone | off;
* Default: proxy_cache off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyCache() {
		super(contexts, "off", "proxy_cache");
	}

}
