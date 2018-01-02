/********************************************************** 
* Syntax: http2_recv_timeout time;
* Default: http2_recv_timeout 30s;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2RecvTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public Http2RecvTimeout() {
		super(contexts, "30s", "http2_recv_timeout");
	}

}
