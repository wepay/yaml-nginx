/********************************************************** 
* Syntax: health_check [parameters];
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.upstream.hc;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HealthCheck extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	public HealthCheck() {
		super(contexts, null, "health_check");
	}

}
