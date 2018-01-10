/********************************************************** 
* Syntax: ssl_session_tickets on | off;
* Default: ssl_session_tickets on;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslSessionTickets extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslSessionTickets() {
		super(contexts, "on", "ssl_session_tickets");
	}

}
