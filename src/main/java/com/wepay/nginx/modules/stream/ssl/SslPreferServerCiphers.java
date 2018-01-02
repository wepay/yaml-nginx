/********************************************************** 
* Syntax: ssl_prefer_server_ciphers on | off;
* Default: ssl_prefer_server_ciphers off;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslPreferServerCiphers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public SslPreferServerCiphers() {
		super(contexts, "off", "ssl_prefer_server_ciphers");
	}

}
