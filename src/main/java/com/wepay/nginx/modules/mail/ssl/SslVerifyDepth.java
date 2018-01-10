/********************************************************** 
* Syntax: ssl_verify_depth number;
* Default: ssl_verify_depth 1;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslVerifyDepth extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public SslVerifyDepth() {
		super(contexts, "1", "ssl_verify_depth");
	}

}
