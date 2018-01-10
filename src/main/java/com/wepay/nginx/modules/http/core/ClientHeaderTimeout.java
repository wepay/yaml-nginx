/********************************************************** 
* Syntax: client_header_timeout time;
* Default: client_header_timeout 60s;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientHeaderTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public ClientHeaderTimeout() {
		super(contexts, "60s", "client_header_timeout");
	}

}
