/********************************************************** 
* Syntax: proxy_send_timeout time;
* Default: proxy_send_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySendTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxySendTimeout() {
		super(contexts, "60s", "proxy_send_timeout");
	}

}
