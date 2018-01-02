/********************************************************** 
* Syntax: auth_jwt string [token=$variable] | off;
* Default: auth_jwt off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.auth.jwt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthJwt extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public AuthJwt() {
		super(contexts, "off", "auth_jwt");
	}

}
