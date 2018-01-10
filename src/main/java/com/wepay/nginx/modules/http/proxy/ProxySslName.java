/********************************************************** 
* Syntax: proxy_ssl_name name;
* Default: proxy_ssl_name $proxy_host;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxySslName() {
		super(contexts, "$proxy_host", "proxy_ssl_name");
	}

}
