/********************************************************** 
* Syntax: proxy_protocol on | off;
* Default: proxy_protocol off;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyProtocol extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyProtocol() {
		super(contexts, "off", "proxy_protocol");
	}

}
