/********************************************************** 
* Syntax: scgi_ignore_client_abort on | off;
* Default: scgi_ignore_client_abort off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiIgnoreClientAbort extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiIgnoreClientAbort() {
		super(contexts, "off", "scgi_ignore_client_abort");
	}

}
