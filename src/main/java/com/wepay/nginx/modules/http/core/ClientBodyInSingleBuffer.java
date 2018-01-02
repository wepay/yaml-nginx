/********************************************************** 
* Syntax: client_body_in_single_buffer on | off;
* Default: client_body_in_single_buffer off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientBodyInSingleBuffer extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ClientBodyInSingleBuffer() {
		super(contexts, "off", "client_body_in_single_buffer");
	}

}
