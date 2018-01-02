/********************************************************** 
* Syntax: limit_conn_log_level info | notice | warn | error;
* Default: limit_conn_log_level error;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.limit.conn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitConnLogLevel extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public LimitConnLogLevel() {
		super(contexts, "error", "limit_conn_log_level");
	}

}
