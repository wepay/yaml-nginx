/********************************************************** 
* Syntax: proxy_pass_request_body on | off;
* Default: proxy_pass_request_body on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyPassRequestBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyPassRequestBody() {
		super(contexts, "on", "proxy_pass_request_body");
	}

}
