/********************************************************** 
* Syntax: fastcgi_no_cache string ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiNoCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiNoCache() {
		super(contexts, null, "fastcgi_no_cache");
	}

}
