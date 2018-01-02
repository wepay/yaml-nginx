/********************************************************** 
* Syntax: resolver_timeout time;
* Default: resolver_timeout 30s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ResolverTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ResolverTimeout() {
		super(contexts, "30s", "resolver_timeout");
	}

}
