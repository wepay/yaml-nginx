/********************************************************** 
* Syntax: ssl_certificate_key file;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslCertificateKey extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public SslCertificateKey() {
		super(contexts, null, "ssl_certificate_key");
	}

}
