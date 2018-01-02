/********************************************************** 
* Syntax: limit_req_log_level info | notice | warn | error;
* Default: limit_req_log_level error;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.limit.req;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitReqLogLevel extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public LimitReqLogLevel() {
		super(contexts, "error", "limit_req_log_level");
	}

}
