/********************************************************** 
* Syntax: uwsgi_cache_max_range_offset number;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCacheMaxRangeOffset extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiCacheMaxRangeOffset() {
		super(contexts, null, "uwsgi_cache_max_range_offset");
	}

}
