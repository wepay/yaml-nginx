/********************************************************** 
* Syntax: http2_max_concurrent_streams number;
* Default: http2_max_concurrent_streams 128;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2MaxConcurrentStreams extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public Http2MaxConcurrentStreams() {
		super(contexts, "128", "http2_max_concurrent_streams");
	}

}
