/********************************************************** 
* Syntax: proxy_cookie_path off;
* Default: proxy_cookie_path off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCookiePath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCookiePath() {
		super(contexts, "off", "proxy_cookie_path");
	}

}
