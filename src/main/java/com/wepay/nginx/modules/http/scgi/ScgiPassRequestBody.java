/********************************************************** 
* Syntax: scgi_pass_request_body on | off;
* Default: scgi_pass_request_body on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiPassRequestBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiPassRequestBody() {
		super(contexts, "on", "scgi_pass_request_body");
	}

}
