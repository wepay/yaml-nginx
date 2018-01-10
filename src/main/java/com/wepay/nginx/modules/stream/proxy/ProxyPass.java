/********************************************************** 
* Syntax: proxy_pass address;
* Default: —
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyPass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}

	public ProxyPass() {
		super(contexts, null, "proxy_pass");
	}

}
