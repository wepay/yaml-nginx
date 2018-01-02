/********************************************************** 
* Syntax: proxy_read_timeout time;
* Default: proxy_read_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyReadTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyReadTimeout() {
		super(contexts, "60s", "proxy_read_timeout");
	}

}
