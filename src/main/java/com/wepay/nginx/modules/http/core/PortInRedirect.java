/********************************************************** 
* Syntax: port_in_redirect on | off;
* Default: port_in_redirect on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PortInRedirect extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public PortInRedirect() {
		super(contexts, "on", "port_in_redirect");
	}

}
