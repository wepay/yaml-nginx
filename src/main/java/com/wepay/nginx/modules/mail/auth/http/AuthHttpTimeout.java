/********************************************************** 
* Syntax: auth_http_timeout time;
* Default: auth_http_timeout 60s;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.auth.http;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthHttpTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public AuthHttpTimeout() {
		super(contexts, "60s", "auth_http_timeout");
	}

}
