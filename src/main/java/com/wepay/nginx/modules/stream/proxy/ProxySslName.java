/********************************************************** 
* Syntax: proxy_ssl_name name;
* Default: proxy_ssl_name host from proxy_pass;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxySslName() {
		super(contexts, "host from proxy_pass", "proxy_ssl_name");
	}

}
