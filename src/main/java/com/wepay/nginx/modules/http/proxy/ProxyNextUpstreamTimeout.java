/********************************************************** 
* Syntax: proxy_next_upstream_timeout time;
* Default: proxy_next_upstream_timeout 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyNextUpstreamTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyNextUpstreamTimeout() {
		super(contexts, "0", "proxy_next_upstream_timeout");
	}

}
