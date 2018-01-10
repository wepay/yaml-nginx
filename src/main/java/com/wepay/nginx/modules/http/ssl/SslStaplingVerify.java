/********************************************************** 
* Syntax: ssl_stapling_verify on | off;
* Default: ssl_stapling_verify off;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslStaplingVerify extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslStaplingVerify() {
		super(contexts, "off", "ssl_stapling_verify");
	}

}
