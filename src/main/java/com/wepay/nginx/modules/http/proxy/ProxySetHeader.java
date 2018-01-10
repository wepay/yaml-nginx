/********************************************************** 
* Syntax: proxy_set_header field value;
* Default: proxy_set_header Host $proxy_host;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySetHeader extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxySetHeader() {
		super(contexts, "Host $proxy_host", "proxy_set_header");
	}

}
