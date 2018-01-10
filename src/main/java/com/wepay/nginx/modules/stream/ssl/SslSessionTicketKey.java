/********************************************************** 
* Syntax: ssl_session_ticket_key file;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslSessionTicketKey extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public SslSessionTicketKey() {
		super(contexts, null, "ssl_session_ticket_key");
	}

}
