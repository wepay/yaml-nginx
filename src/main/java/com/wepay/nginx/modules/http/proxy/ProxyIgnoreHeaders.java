/********************************************************** 
* Syntax: proxy_ignore_headers field ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyIgnoreHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyIgnoreHeaders() {
		super(contexts, null, "proxy_ignore_headers");
	}

}
