/********************************************************** 
* Syntax: client_body_in_file_only on | clean | off;
* Default: client_body_in_file_only off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientBodyInFileOnly extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ClientBodyInFileOnly() {
		super(contexts, "off", "client_body_in_file_only");
	}

}
