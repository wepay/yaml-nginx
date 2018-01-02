/********************************************************** 
* Syntax: scgi_cache_min_uses number;
* Default: scgi_cache_min_uses 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheMinUses extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiCacheMinUses() {
		super(contexts, "1", "scgi_cache_min_uses");
	}

}
