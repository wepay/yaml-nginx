/********************************************************** 
* Syntax: auth_basic_user_file file;
* Default: —
* Context: http, server, location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.auth.basic;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthBasicUserFile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, LIMIT_EXCEPT);
	}

	public AuthBasicUserFile() {
		super(contexts, null, "auth_basic_user_file");
	}

}
