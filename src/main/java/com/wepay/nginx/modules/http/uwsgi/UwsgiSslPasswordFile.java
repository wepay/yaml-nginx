/********************************************************** 
* Syntax: uwsgi_ssl_password_file file;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslPasswordFile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiSslPasswordFile() {
		super(contexts, null, "uwsgi_ssl_password_file");
	}

}
