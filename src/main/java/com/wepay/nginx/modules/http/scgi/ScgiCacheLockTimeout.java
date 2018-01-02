/********************************************************** 
* Syntax: scgi_cache_lock_timeout time;
* Default: scgi_cache_lock_timeout 5s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiCacheLockTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiCacheLockTimeout() {
		super(contexts, "5s", "scgi_cache_lock_timeout");
	}

}
