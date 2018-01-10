/********************************************************** 
* Syntax: auth_jwt_header_set $variable name ...;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.auth.jwt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthJwtHeaderSet extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public AuthJwtHeaderSet() {
		super(contexts, null, "auth_jwt_header_set");
	}

}
