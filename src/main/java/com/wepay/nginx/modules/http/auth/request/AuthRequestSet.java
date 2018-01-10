/********************************************************** 
* Syntax: auth_request_set $variable value;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.auth.request;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthRequestSet extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public AuthRequestSet() {
		super(contexts, null, "auth_request_set");
	}

}
