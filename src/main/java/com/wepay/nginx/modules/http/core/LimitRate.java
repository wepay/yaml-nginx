/********************************************************** 
* Syntax: limit_rate rate;
* Default: limit_rate 0;
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION,IF_IN_LOCATION);
	}
	public LimitRate() {
		super(contexts, "0", "limit_rate");
	}

}
