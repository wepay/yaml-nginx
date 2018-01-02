/********************************************************** 
* Syntax: uwsgi_pass_request_body on | off;
* Default: uwsgi_pass_request_body on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiPassRequestBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiPassRequestBody() {
		super(contexts, "on", "uwsgi_pass_request_body");
	}

}
