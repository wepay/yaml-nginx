/********************************************************** 
* Syntax: scgi_cache_background_update on | off;
* Default: scgi_cache_background_update off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheBackgroundUpdate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiCacheBackgroundUpdate() {
		super(contexts, "off", "scgi_cache_background_update");
	}

}
