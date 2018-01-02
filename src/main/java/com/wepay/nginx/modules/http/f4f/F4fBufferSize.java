/********************************************************** 
* Syntax: f4f_buffer_size size;
* Default: f4f_buffer_size 512k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.f4f;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class F4fBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public F4fBufferSize() {
		super(contexts, "512k", "f4f_buffer_size");
	}

}
