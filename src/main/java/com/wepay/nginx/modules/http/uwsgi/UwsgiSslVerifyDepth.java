/********************************************************** 
* Syntax: uwsgi_ssl_verify_depth number;
* Default: uwsgi_ssl_verify_depth 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslVerifyDepth extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiSslVerifyDepth() {
		super(contexts, "1", "uwsgi_ssl_verify_depth");
	}

}
