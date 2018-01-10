/********************************************************** 
* Syntax: userid_service number;
* Default: userid_service IP address of the server;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UseridService extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UseridService() {
		super(contexts, "IP address of the server", "userid_service");
	}

}
