/********************************************************** 
* Syntax: fastcgi_next_upstream_timeout time;
* Default: fastcgi_next_upstream_timeout 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiNextUpstreamTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiNextUpstreamTimeout() {
		super(contexts, "0", "fastcgi_next_upstream_timeout");
	}

}
