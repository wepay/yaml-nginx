/********************************************************** 
* Syntax: client_body_buffer_size size;
* Default: client_body_buffer_size 8k|16k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientBodyBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ClientBodyBufferSize() {
		super(contexts, "8k|16k", "client_body_buffer_size");
	}

}
