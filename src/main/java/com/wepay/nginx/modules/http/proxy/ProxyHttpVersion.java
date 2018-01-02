/********************************************************** 
* Syntax: proxy_http_version 1.0 | 1.1;
* Default: proxy_http_version 1.0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyHttpVersion extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyHttpVersion() {
		super(contexts, "1.0", "proxy_http_version");
	}

}
