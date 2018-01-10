/********************************************************** 
* Syntax: proxy_bind address [transparent] | off;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyBind extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyBind() {
		super(contexts, null, "proxy_bind");
	}

}
