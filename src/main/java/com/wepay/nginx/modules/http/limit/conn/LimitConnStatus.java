/********************************************************** 
* Syntax: limit_conn_status code;
* Default: limit_conn_status 503;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.limit.conn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitConnStatus extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public LimitConnStatus() {
		super(contexts, "503", "limit_conn_status");
	}

}
