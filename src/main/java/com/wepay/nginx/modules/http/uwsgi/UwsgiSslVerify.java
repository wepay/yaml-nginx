/********************************************************** 
* Syntax: uwsgi_ssl_verify on | off;
* Default: uwsgi_ssl_verify off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslVerify extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiSslVerify() {
		super(contexts, "off", "uwsgi_ssl_verify");
	}

}
