/********************************************************** 
* Syntax: client_body_timeout time;
* Default: client_body_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientBodyTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ClientBodyTimeout() {
		super(contexts, "60s", "client_body_timeout");
	}

}
