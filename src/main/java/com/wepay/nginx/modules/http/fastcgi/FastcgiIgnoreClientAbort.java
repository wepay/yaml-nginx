/********************************************************** 
* Syntax: fastcgi_ignore_client_abort on | off;
* Default: fastcgi_ignore_client_abort off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiIgnoreClientAbort extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiIgnoreClientAbort() {
		super(contexts, "off", "fastcgi_ignore_client_abort");
	}

}
