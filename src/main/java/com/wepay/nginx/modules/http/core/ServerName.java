/********************************************************** 
* Syntax: server_name name ...;
* Default: server_name "";
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ServerName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}

	public ServerName() {
		super(contexts, "\"\"", "server_name");
	}

}
