/********************************************************** 
* Syntax: scgi_send_timeout time;
* Default: scgi_send_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiSendTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiSendTimeout() {
		super(contexts, "60s", "scgi_send_timeout");
	}

}
