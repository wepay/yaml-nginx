/********************************************************** 
* Syntax: http2_max_requests number;
* Default: http2_max_requests 1000;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2MaxRequests extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public Http2MaxRequests() {
		super(contexts, "1000", "http2_max_requests");
	}

}
