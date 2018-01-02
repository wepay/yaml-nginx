/********************************************************** 
* Syntax: proxy_ssl on | off;
* Default: proxy_ssl off;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySsl extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public ProxySsl() {
		super(contexts, "off", "proxy_ssl");
	}

}
