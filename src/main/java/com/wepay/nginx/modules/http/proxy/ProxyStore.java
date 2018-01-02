/********************************************************** 
* Syntax: proxy_store on | off | string;
* Default: proxy_store off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyStore extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyStore() {
		super(contexts, "off", "proxy_store");
	}

}
