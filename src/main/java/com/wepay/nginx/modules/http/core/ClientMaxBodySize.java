/********************************************************** 
* Syntax: client_max_body_size size;
* Default: client_max_body_size 1m;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientMaxBodySize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ClientMaxBodySize() {
		super(contexts, "1m", "client_max_body_size");
	}

}
