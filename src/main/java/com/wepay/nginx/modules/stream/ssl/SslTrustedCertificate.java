/********************************************************** 
* Syntax: ssl_trusted_certificate file;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslTrustedCertificate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public SslTrustedCertificate() {
		super(contexts, null, "ssl_trusted_certificate");
	}

}
