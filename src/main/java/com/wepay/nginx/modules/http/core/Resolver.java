/********************************************************** 
* Syntax: resolver address ... [valid=time] [ipv6=on|off];
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Resolver extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Resolver() {
		super(contexts, null, "resolver");
	}

}
