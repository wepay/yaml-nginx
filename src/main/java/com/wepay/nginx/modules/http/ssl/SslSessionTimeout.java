/********************************************************** 
* Syntax: ssl_session_timeout time;
* Default: ssl_session_timeout 5m;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslSessionTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public SslSessionTimeout() {
		super(contexts, "5m", "ssl_session_timeout");
	}

}
