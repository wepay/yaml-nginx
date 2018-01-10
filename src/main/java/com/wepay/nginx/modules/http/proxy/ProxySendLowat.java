/********************************************************** 
* Syntax: proxy_send_lowat size;
* Default: proxy_send_lowat 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySendLowat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxySendLowat() {
		super(contexts, "0", "proxy_send_lowat");
	}

}
