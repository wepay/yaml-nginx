/********************************************************** 
* Syntax: limit_req_status code;
* Default: limit_req_status 503;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.limit.req;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitReqStatus extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public LimitReqStatus() {
		super(contexts, "503", "limit_req_status");
	}

}
