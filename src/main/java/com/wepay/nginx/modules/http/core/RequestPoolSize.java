/********************************************************** 
* Syntax: request_pool_size size;
* Default: request_pool_size 4k;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RequestPoolSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public RequestPoolSize() {
		super(contexts, "4k", "request_pool_size");
	}

}
