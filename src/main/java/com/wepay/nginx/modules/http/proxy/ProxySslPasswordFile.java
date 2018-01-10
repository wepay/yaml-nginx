/********************************************************** 
* Syntax: proxy_ssl_password_file file;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslPasswordFile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxySslPasswordFile() {
		super(contexts, null, "proxy_ssl_password_file");
	}

}
