/********************************************************** 
* Syntax: proxy_cache_lock_timeout time;
* Default: proxy_cache_lock_timeout 5s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheLockTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCacheLockTimeout() {
		super(contexts, "5s", "proxy_cache_lock_timeout");
	}

}
