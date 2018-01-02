/********************************************************** 
* Syntax: auth_jwt_key_file file;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.auth.jwt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthJwtKeyFile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public AuthJwtKeyFile() {
		super(contexts, null, "auth_jwt_key_file");
	}

}
