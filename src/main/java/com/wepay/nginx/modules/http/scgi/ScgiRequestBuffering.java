/********************************************************** 
* Syntax: scgi_request_buffering on | off;
* Default: scgi_request_buffering on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiRequestBuffering extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiRequestBuffering() {
		super(contexts, "on", "scgi_request_buffering");
	}

}
