/********************************************************** 
* Syntax: uwsgi_send_timeout time;
* Default: uwsgi_send_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSendTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiSendTimeout() {
		super(contexts, "60s", "uwsgi_send_timeout");
	}

}
