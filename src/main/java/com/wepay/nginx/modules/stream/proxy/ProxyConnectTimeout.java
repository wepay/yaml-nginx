/********************************************************** 
* Syntax: proxy_connect_timeout time;
* Default: proxy_connect_timeout 60s;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyConnectTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyConnectTimeout() {
		super(contexts, "60s", "proxy_connect_timeout");
	}

}
