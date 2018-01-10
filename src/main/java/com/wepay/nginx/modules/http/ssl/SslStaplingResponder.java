/********************************************************** 
* Syntax: ssl_stapling_responder url;
* Default: —
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslStaplingResponder extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslStaplingResponder() {
		super(contexts, null, "ssl_stapling_responder");
	}

}
