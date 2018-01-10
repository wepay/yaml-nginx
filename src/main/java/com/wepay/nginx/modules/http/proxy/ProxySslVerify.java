/********************************************************** 
* Syntax: proxy_ssl_verify on | off;
* Default: proxy_ssl_verify off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslVerify extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxySslVerify() {
		super(contexts, "off", "proxy_ssl_verify");
	}

}
