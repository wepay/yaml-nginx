/********************************************************** 
* Syntax: ssl_certificate_key file;
* Default: —
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslCertificateKey extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public SslCertificateKey() {
		super(contexts, null, "ssl_certificate_key");
	}

}
