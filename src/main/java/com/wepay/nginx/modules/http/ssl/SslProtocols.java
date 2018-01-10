/********************************************************** 
* Syntax: ssl_protocols [SSLv2] [SSLv3] [TLSv1] [TLSv1.1] [TLSv1.2] [TLSv1.3];
* Default: ssl_protocols TLSv1 TLSv1.1 TLSv1.2;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslProtocols extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslProtocols() {
		super(contexts, "TLSv1 TLSv1.1 TLSv1.2", "ssl_protocols");
	}

}
