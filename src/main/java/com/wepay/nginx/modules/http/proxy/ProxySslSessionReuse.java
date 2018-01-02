/********************************************************** 
* Syntax: proxy_ssl_session_reuse on | off;
* Default: proxy_ssl_session_reuse on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslSessionReuse extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ProxySslSessionReuse() {
		super(contexts, "on", "proxy_ssl_session_reuse");
	}

}
