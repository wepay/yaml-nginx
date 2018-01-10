/********************************************************** 
* Syntax: fastcgi_read_timeout time;
* Default: fastcgi_read_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiReadTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiReadTimeout() {
		super(contexts, "60s", "fastcgi_read_timeout");
	}

}
