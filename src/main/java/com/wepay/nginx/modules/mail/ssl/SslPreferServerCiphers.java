/********************************************************** 
* Syntax: ssl_prefer_server_ciphers on | off;
* Default: ssl_prefer_server_ciphers off;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslPreferServerCiphers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public SslPreferServerCiphers() {
		super(contexts, "off", "ssl_prefer_server_ciphers");
	}

}
