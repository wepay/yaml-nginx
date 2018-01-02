/********************************************************** 
* Syntax: proxy_headers_hash_max_size size;
* Default: proxy_headers_hash_max_size 512;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyHeadersHashMaxSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyHeadersHashMaxSize() {
		super(contexts, "512", "proxy_headers_hash_max_size");
	}

}
