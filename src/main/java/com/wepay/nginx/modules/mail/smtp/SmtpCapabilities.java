/********************************************************** 
* Syntax: smtp_capabilities extension ...;
* Default: —
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.smtp;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SmtpCapabilities extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public SmtpCapabilities() {
		super(contexts, null, "smtp_capabilities");
	}

}
