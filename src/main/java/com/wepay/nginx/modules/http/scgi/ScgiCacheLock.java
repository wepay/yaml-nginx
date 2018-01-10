/********************************************************** 
* Syntax: scgi_cache_lock on | off;
* Default: scgi_cache_lock off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheLock extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiCacheLock() {
		super(contexts, "off", "scgi_cache_lock");
	}

}
