/********************************************************** 
* Syntax: proxy_temp_path path [level1 [level2 [level3]]];
* Default: proxy_temp_path proxy_temp;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyTempPath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyTempPath() {
		super(contexts, "proxy_temp", "proxy_temp_path");
	}

}
