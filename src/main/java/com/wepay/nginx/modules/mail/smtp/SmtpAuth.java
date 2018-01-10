/********************************************************** 
* Syntax: smtp_auth method ...;
* Default: smtp_auth login plain;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.smtp;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SmtpAuth extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public SmtpAuth() {
		super(contexts, "login plain", "smtp_auth");
	}

}
