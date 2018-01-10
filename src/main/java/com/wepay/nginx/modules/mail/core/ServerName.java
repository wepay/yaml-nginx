/********************************************************** 
* Syntax: server_name name;
* Default: server_name hostname;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ServerName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public ServerName() {
		super(contexts, "hostname", "server_name");
	}

}
