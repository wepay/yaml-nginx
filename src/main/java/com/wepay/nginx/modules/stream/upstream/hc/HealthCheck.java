/********************************************************** 
* Syntax: health_check [parameters];
* Default: —
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.stream.upstream.hc;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HealthCheck extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}
	public HealthCheck() {
		super(contexts, null, "health_check");
	}

}
