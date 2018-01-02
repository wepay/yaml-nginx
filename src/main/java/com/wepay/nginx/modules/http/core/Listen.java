/********************************************************** 
* Syntax: listen address[:port] [default_server] [ssl] [http2 | spdy] [proxy_protocol] [setfib=number] [fastopen=number] [backlog=number] [rcvbuf=size] [sndbuf=size] [accept_filter=filter] [deferred] [bind] [ipv6only=on|off] [reuseport] [so_keepalive=on|off|[keepidle]:[keepintvl]:[keepcnt]];
* Default: listen *:80 | *:8000;
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Listen extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}
	public Listen() {
		super(contexts, "*:80 | *:8000", "listen");
	}

}
