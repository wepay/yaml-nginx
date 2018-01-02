/********************************************************** 
* Syntax: limit_rate_after size;
* Default: limit_rate_after 0;
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitRateAfter extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION,IF_IN_LOCATION);
	}
	public LimitRateAfter() {
		super(contexts, "0", "limit_rate_after");
	}

}
