/********************************************************** 
* Syntax: uwsgi_next_upstream_tries number;
* Default: uwsgi_next_upstream_tries 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiNextUpstreamTries extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiNextUpstreamTries() {
		super(contexts, "0", "uwsgi_next_upstream_tries");
	}

}
