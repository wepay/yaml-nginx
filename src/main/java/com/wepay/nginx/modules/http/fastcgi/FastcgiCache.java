/********************************************************** 
* Syntax: fastcgi_cache zone | off;
* Default: fastcgi_cache off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiCache() {
		super(contexts, "off", "fastcgi_cache");
	}

}
