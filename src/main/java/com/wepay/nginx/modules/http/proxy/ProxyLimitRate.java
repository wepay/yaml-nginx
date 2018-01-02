/********************************************************** 
* Syntax: proxy_limit_rate rate;
* Default: proxy_limit_rate 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyLimitRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyLimitRate() {
		super(contexts, "0", "proxy_limit_rate");
	}

}
