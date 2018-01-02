/********************************************************** 
* Syntax: pop3_auth method ...;
* Default: pop3_auth plain;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.pop3;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Pop3Auth extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public Pop3Auth() {
		super(contexts, "plain", "pop3_auth");
	}

}
