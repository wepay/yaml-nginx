/********************************************************** 
* Syntax: proxy_ssl_verify_depth number;
* Default: proxy_ssl_verify_depth 1;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslVerifyDepth extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxySslVerifyDepth() {
		super(contexts, "1", "proxy_ssl_verify_depth");
	}

}
