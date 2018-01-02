/********************************************************** 
* Syntax: proxy_pass URL;
* Default: —
* Context: location, if in location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyPass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION,IF_IN_LOCATION,LIMIT_EXCEPT);
	}
	public ProxyPass() {
		super(contexts, null, "proxy_pass");
	}

}
