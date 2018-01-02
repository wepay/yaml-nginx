/********************************************************** 
* Syntax: uwsgi_request_buffering on | off;
* Default: uwsgi_request_buffering on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiRequestBuffering extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiRequestBuffering() {
		super(contexts, "on", "uwsgi_request_buffering");
	}

}
