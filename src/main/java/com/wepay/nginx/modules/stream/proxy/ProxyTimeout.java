/********************************************************** 
* Syntax: proxy_timeout timeout;
* Default: proxy_timeout 10m;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyTimeout() {
		super(contexts, "10m", "proxy_timeout");
	}

}
