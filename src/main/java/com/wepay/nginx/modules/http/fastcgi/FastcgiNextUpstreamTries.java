/********************************************************** 
* Syntax: fastcgi_next_upstream_tries number;
* Default: fastcgi_next_upstream_tries 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiNextUpstreamTries extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiNextUpstreamTries() {
		super(contexts, "0", "fastcgi_next_upstream_tries");
	}

}
