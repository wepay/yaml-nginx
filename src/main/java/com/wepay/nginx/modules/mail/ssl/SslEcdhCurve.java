/********************************************************** 
* Syntax: ssl_ecdh_curve curve;
* Default: ssl_ecdh_curve auto;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslEcdhCurve extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public SslEcdhCurve() {
		super(contexts, "auto", "ssl_ecdh_curve");
	}

}
