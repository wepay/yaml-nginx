/********************************************************** 
* Syntax: uwsgi_ssl_name name;
* Default: uwsgi_ssl_name host from uwsgi_pass;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiSslName() {
		super(contexts, "host from uwsgi_pass", "uwsgi_ssl_name");
	}

}
