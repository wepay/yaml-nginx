/********************************************************** 
* Syntax: uwsgi_ssl_trusted_certificate file;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslTrustedCertificate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiSslTrustedCertificate() {
		super(contexts, null, "uwsgi_ssl_trusted_certificate");
	}

}
