/********************************************************** 
* Syntax: proxy_cache_convert_head on | off;
* Default: proxy_cache_convert_head on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheConvertHead extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyCacheConvertHead() {
		super(contexts, "on", "proxy_cache_convert_head");
	}

}
