/********************************************************** 
* Syntax: tcp_nodelay on | off;
* Default: tcp_nodelay on;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class TcpNodelay extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public TcpNodelay() {
		super(contexts, "on", "tcp_nodelay");
	}

}
