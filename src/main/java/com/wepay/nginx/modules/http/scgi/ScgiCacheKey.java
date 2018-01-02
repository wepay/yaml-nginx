/********************************************************** 
* Syntax: scgi_cache_key string;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheKey extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiCacheKey() {
		super(contexts, null, "scgi_cache_key");
	}

}
