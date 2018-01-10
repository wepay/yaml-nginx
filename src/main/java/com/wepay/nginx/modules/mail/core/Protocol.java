/********************************************************** 
* Syntax: protocol imap | pop3 | smtp;
* Default: —
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.mail.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Protocol extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}

	public Protocol() {
		super(contexts, null, "protocol");
	}

}
