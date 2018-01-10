/********************************************************** 
* Syntax: server_name_in_redirect on | off;
* Default: server_name_in_redirect off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ServerNameInRedirect extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ServerNameInRedirect() {
		super(contexts, "off", "server_name_in_redirect");
	}

}
