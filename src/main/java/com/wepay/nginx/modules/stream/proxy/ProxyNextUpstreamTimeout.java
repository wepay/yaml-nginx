/********************************************************** 
* Syntax: proxy_next_upstream_timeout time;
* Default: proxy_next_upstream_timeout 0;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyNextUpstreamTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyNextUpstreamTimeout() {
		super(contexts, "0", "proxy_next_upstream_timeout");
	}

}
