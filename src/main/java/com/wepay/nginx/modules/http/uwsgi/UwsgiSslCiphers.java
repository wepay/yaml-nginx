/********************************************************** 
* Syntax: uwsgi_ssl_ciphers ciphers;
* Default: uwsgi_ssl_ciphers DEFAULT;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslCiphers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiSslCiphers() {
		super(contexts, "DEFAULT", "uwsgi_ssl_ciphers");
	}

}
