/********************************************************** 
* Syntax: proxy_buffering on | off;
* Default: proxy_buffering on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyBuffering extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyBuffering() {
		super(contexts, "on", "proxy_buffering");
	}

}
