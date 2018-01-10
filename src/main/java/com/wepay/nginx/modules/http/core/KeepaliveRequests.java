/********************************************************** 
* Syntax: keepalive_requests number;
* Default: keepalive_requests 100;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class KeepaliveRequests extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public KeepaliveRequests() {
		super(contexts, "100", "keepalive_requests");
	}

}
