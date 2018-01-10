/********************************************************** 
* Syntax: server_tokens on | off | build | string;
* Default: server_tokens on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ServerTokens extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ServerTokens() {
		super(contexts, "on", "server_tokens");
	}

}
