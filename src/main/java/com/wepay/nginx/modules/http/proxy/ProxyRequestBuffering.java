/********************************************************** 
* Syntax: proxy_request_buffering on | off;
* Default: proxy_request_buffering on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyRequestBuffering extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyRequestBuffering() {
		super(contexts, "on", "proxy_request_buffering");
	}

}
