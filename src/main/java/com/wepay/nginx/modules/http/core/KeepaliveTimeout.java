/********************************************************** 
* Syntax: keepalive_timeout timeout [header_timeout];
* Default: keepalive_timeout 75s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class KeepaliveTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public KeepaliveTimeout() {
		super(contexts, "75s", "keepalive_timeout");
	}

}
