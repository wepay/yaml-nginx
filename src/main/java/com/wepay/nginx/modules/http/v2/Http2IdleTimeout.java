/********************************************************** 
* Syntax: http2_idle_timeout time;
* Default: http2_idle_timeout 3m;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2IdleTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public Http2IdleTimeout() {
		super(contexts, "3m", "http2_idle_timeout");
	}

}
