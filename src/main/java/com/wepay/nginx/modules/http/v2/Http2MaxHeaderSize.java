/********************************************************** 
* Syntax: http2_max_header_size size;
* Default: http2_max_header_size 16k;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2MaxHeaderSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public Http2MaxHeaderSize() {
		super(contexts, "16k", "http2_max_header_size");
	}

}
