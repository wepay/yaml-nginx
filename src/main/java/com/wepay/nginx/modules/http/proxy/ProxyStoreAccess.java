/********************************************************** 
* Syntax: proxy_store_access users:permissions ...;
* Default: proxy_store_access user:rw;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyStoreAccess extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyStoreAccess() {
		super(contexts, "user:rw", "proxy_store_access");
	}

}
