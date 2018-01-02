/********************************************************** 
* Syntax: scgi_next_upstream_timeout time;
* Default: scgi_next_upstream_timeout 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiNextUpstreamTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiNextUpstreamTimeout() {
		super(contexts, "0", "scgi_next_upstream_timeout");
	}

}
