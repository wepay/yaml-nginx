/********************************************************** 
* Syntax: proxy_timeout timeout;
* Default: proxy_timeout 24h;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public ProxyTimeout() {
		super(contexts, "24h", "proxy_timeout");
	}

}
