/********************************************************** 
* Syntax: tcp_nopush on | off;
* Default: tcp_nopush off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class TcpNopush extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public TcpNopush() {
		super(contexts, "off", "tcp_nopush");
	}

}
