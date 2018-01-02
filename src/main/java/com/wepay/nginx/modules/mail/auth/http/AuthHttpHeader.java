/********************************************************** 
* Syntax: auth_http_header header value;
* Default: —
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.auth.http;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthHttpHeader extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public AuthHttpHeader() {
		super(contexts, null, "auth_http_header");
	}

}
