/********************************************************** 
* Syntax: limit_req_zone key zone=name:size rate=rate;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.limit.req;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitReqZone extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public LimitReqZone() {
		super(contexts, null, "limit_req_zone");
	}

}
