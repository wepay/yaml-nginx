/********************************************************** 
* Syntax: ssl_ciphers ciphers;
* Default: ssl_ciphers HIGH:!aNULL:!MD5;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslCiphers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public SslCiphers() {
		super(contexts, "HIGH:!aNULL:!MD5", "ssl_ciphers");
	}

}
