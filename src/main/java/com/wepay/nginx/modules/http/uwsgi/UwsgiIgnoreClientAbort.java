/********************************************************** 
* Syntax: uwsgi_ignore_client_abort on | off;
* Default: uwsgi_ignore_client_abort off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiIgnoreClientAbort extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiIgnoreClientAbort() {
		super(contexts, "off", "uwsgi_ignore_client_abort");
	}

}
