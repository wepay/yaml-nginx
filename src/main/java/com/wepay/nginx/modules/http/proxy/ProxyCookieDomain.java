/********************************************************** 
* Syntax: proxy_cookie_domain off;
* Default: proxy_cookie_domain off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCookieDomain extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyCookieDomain() {
		super(contexts, "off", "proxy_cookie_domain");
	}

}
