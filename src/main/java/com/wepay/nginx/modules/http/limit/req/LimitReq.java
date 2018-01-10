/********************************************************** 
* Syntax: limit_req zone=name [burst=number] [nodelay];
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.limit.req;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitReq extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public LimitReq() {
		super(contexts, null, "limit_req");
	}

}
