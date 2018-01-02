/********************************************************** 
* Syntax: proxy_set_body value;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySetBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxySetBody() {
		super(contexts, null, "proxy_set_body");
	}

}
