/********************************************************** 
* Syntax: ssl_handshake_timeout time;
* Default: ssl_handshake_timeout 60s;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslHandshakeTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public SslHandshakeTimeout() {
		super(contexts, "60s", "ssl_handshake_timeout");
	}

}
