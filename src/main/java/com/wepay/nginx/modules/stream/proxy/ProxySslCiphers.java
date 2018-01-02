/********************************************************** 
* Syntax: proxy_ssl_ciphers ciphers;
* Default: proxy_ssl_ciphers DEFAULT;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslCiphers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public ProxySslCiphers() {
		super(contexts, "DEFAULT", "proxy_ssl_ciphers");
	}

}
