/********************************************************** 
* Syntax: connection_pool_size size;
* Default: connection_pool_size 256|512;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ConnectionPoolSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public ConnectionPoolSize() {
		super(contexts, "256|512", "connection_pool_size");
	}

}
