/********************************************************** 
* Syntax: proxy_cache_max_range_offset number;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyCacheMaxRangeOffset extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyCacheMaxRangeOffset() {
		super(contexts, null, "proxy_cache_max_range_offset");
	}

}
