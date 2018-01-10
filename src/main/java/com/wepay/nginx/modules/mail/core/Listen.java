/********************************************************** 
* Syntax: listen address:port [ssl] [backlog=number] [rcvbuf=size] [sndbuf=size] [bind] [ipv6only=on|off] [so_keepalive=on|off|[keepidle]:[keepintvl]:[keepcnt]];
* Default: —
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.mail.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Listen extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}

	public Listen() {
		super(contexts, null, "listen");
	}

}
