/********************************************************** 
* Syntax: limit_conn zone number;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.limit.conn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitConn extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public LimitConn() {
		super(contexts, null, "limit_conn");
	}

}
