/********************************************************** 
* Syntax: ssl_trusted_certificate file;
* Default: —
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslTrustedCertificate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslTrustedCertificate() {
		super(contexts, null, "ssl_trusted_certificate");
	}

}
