/********************************************************** 
* Syntax: imap_auth method ...;
* Default: imap_auth plain;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.imap;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImapAuth extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public ImapAuth() {
		super(contexts, "plain", "imap_auth");
	}

}
