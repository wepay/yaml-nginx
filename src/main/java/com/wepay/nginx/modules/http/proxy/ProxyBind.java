/********************************************************** 
* Syntax: proxy_bind address [transparent] | off;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyBind extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyBind() {
		super(contexts, null, "proxy_bind");
	}

}
