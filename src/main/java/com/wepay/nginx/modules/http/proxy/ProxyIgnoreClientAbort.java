/********************************************************** 
* Syntax: proxy_ignore_client_abort on | off;
* Default: proxy_ignore_client_abort off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyIgnoreClientAbort extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyIgnoreClientAbort() {
		super(contexts, "off", "proxy_ignore_client_abort");
	}

}
