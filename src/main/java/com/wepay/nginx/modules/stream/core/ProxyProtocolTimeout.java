/********************************************************** 
* Syntax: proxy_protocol_timeout timeout;
* Default: proxy_protocol_timeout 30s;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyProtocolTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyProtocolTimeout() {
		super(contexts, "30s", "proxy_protocol_timeout");
	}

}
