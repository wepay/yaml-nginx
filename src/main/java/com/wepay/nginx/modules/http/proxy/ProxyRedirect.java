/********************************************************** 
* Syntax: proxy_redirect default;
* Default: proxy_redirect default;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyRedirect extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyRedirect() {
		super(contexts, "default", "proxy_redirect");
	}

}
