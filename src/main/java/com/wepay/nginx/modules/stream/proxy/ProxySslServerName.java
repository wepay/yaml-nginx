/********************************************************** 
* Syntax: proxy_ssl_server_name on | off;
* Default: proxy_ssl_server_name off;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslServerName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxySslServerName() {
		super(contexts, "off", "proxy_ssl_server_name");
	}

}
