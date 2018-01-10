/********************************************************** 
* Syntax: uwsgi_pass_request_headers on | off;
* Default: uwsgi_pass_request_headers on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiPassRequestHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiPassRequestHeaders() {
		super(contexts, "on", "uwsgi_pass_request_headers");
	}

}
