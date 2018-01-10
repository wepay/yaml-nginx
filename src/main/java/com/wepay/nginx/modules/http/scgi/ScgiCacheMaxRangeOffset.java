/********************************************************** 
* Syntax: scgi_cache_max_range_offset number;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheMaxRangeOffset extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiCacheMaxRangeOffset() {
		super(contexts, null, "scgi_cache_max_range_offset");
	}

}
