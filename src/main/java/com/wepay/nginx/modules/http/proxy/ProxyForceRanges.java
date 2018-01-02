/********************************************************** 
* Syntax: proxy_force_ranges on | off;
* Default: proxy_force_ranges off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyForceRanges extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxyForceRanges() {
		super(contexts, "off", "proxy_force_ranges");
	}

}
