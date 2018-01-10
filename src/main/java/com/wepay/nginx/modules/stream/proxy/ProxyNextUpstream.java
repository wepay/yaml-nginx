/********************************************************** 
* Syntax: proxy_next_upstream on | off;
* Default: proxy_next_upstream on;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyNextUpstream extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyNextUpstream() {
		super(contexts, "on", "proxy_next_upstream");
	}

}
