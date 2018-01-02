/********************************************************** 
* Syntax: imap_capabilities extension ...;
* Default: imap_capabilities IMAP4 IMAP4rev1 UIDPLUS;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.imap;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImapCapabilities extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public ImapCapabilities() {
		super(contexts, "IMAP4 IMAP4rev1 UIDPLUS", "imap_capabilities");
	}

}
