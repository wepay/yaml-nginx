/********************************************************** 
* Syntax: proxy_ssl_trusted_certificate file;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxySslTrustedCertificate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxySslTrustedCertificate() {
		super(contexts, null, "proxy_ssl_trusted_certificate");
	}

}
