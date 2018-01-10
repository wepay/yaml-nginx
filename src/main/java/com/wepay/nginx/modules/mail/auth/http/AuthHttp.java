/********************************************************** 
* Syntax: auth_http URL;
* Default: —
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.auth.http;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthHttp extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public AuthHttp() {
		super(contexts, null, "auth_http");
	}

}
