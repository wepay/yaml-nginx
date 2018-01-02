/********************************************************** 
* Syntax: auth_request uri | off;
* Default: auth_request off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.auth.request;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthRequest extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public AuthRequest() {
		super(contexts, "off", "auth_request");
	}

}
