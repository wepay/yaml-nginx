/********************************************************** 
* Syntax: auth_basic string | off;
* Default: auth_basic off;
* Context: http, server, location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.auth.basic;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthBasic extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, LIMIT_EXCEPT);
	}

	public AuthBasic() {
		super(contexts, "off", "auth_basic");
	}

}
