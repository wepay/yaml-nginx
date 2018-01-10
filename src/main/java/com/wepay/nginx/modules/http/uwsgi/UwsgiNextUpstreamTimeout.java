/********************************************************** 
* Syntax: uwsgi_next_upstream_timeout time;
* Default: uwsgi_next_upstream_timeout 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiNextUpstreamTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiNextUpstreamTimeout() {
		super(contexts, "0", "uwsgi_next_upstream_timeout");
	}

}
