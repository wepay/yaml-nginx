/********************************************************** 
* Syntax: ssl_verify_client on | off | optional | optional_no_ca;
* Default: ssl_verify_client off;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslVerifyClient extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslVerifyClient() {
		super(contexts, "off", "ssl_verify_client");
	}

}
