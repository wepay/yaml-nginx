/********************************************************** 
* Syntax: uwsgi_ssl_server_name on | off;
* Default: uwsgi_ssl_server_name off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslServerName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiSslServerName() {
		super(contexts, "off", "uwsgi_ssl_server_name");
	}

}
