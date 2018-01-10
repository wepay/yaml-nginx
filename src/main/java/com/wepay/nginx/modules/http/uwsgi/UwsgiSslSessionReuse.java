/********************************************************** 
* Syntax: uwsgi_ssl_session_reuse on | off;
* Default: uwsgi_ssl_session_reuse on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslSessionReuse extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiSslSessionReuse() {
		super(contexts, "on", "uwsgi_ssl_session_reuse");
	}

}
