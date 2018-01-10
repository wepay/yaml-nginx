/********************************************************** 
* Syntax: ssl_client_certificate file;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslClientCertificate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public SslClientCertificate() {
		super(contexts, null, "ssl_client_certificate");
	}

}
