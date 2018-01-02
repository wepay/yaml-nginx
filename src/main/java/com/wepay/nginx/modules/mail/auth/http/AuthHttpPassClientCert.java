/********************************************************** 
* Syntax: auth_http_pass_client_cert on | off;
* Default: auth_http_pass_client_cert off;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.auth.http;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AuthHttpPassClientCert extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public AuthHttpPassClientCert() {
		super(contexts, "off", "auth_http_pass_client_cert");
	}

}
