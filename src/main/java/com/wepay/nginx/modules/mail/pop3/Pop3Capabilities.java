/********************************************************** 
* Syntax: pop3_capabilities extension ...;
* Default: pop3_capabilities TOP USER UIDL;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.pop3;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Pop3Capabilities extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public Pop3Capabilities() {
		super(contexts, "TOP USER UIDL", "pop3_capabilities");
	}

}
