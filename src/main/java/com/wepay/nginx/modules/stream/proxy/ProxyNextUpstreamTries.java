/********************************************************** 
* Syntax: proxy_next_upstream_tries number;
* Default: proxy_next_upstream_tries 0;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyNextUpstreamTries extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyNextUpstreamTries() {
		super(contexts, "0", "proxy_next_upstream_tries");
	}

}
