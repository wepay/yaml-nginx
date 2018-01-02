/********************************************************** 
* Syntax: large_client_header_buffers number size;
* Default: large_client_header_buffers 4 8k;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LargeClientHeaderBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public LargeClientHeaderBuffers() {
		super(contexts, "4 8k", "large_client_header_buffers");
	}

}
