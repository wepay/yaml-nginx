/********************************************************** 
* Syntax: client_header_buffer_size size;
* Default: client_header_buffer_size 1k;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientHeaderBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public ClientHeaderBufferSize() {
		super(contexts, "1k", "client_header_buffer_size");
	}

}
