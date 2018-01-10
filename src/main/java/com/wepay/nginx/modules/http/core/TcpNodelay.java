/********************************************************** 
* Syntax: tcp_nodelay on | off;
* Default: tcp_nodelay on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class TcpNodelay extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public TcpNodelay() {
		super(contexts, "on", "tcp_nodelay");
	}

}
