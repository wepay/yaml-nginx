/********************************************************** 
* Syntax: proxy_pass_request_headers on | off;
* Default: proxy_pass_request_headers on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyPassRequestHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyPassRequestHeaders() {
		super(contexts, "on", "proxy_pass_request_headers");
	}

}
