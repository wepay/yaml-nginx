/********************************************************** 
* Syntax: uwsgi_ssl_certificate_key file;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiSslCertificateKey extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiSslCertificateKey() {
		super(contexts, null, "uwsgi_ssl_certificate_key");
	}

}
