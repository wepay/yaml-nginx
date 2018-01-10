/********************************************************** 
* Syntax: uwsgi_connect_timeout time;
* Default: uwsgi_connect_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiConnectTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiConnectTimeout() {
		super(contexts, "60s", "uwsgi_connect_timeout");
	}

}
