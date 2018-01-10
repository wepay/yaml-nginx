/********************************************************** 
* Syntax: health_check_timeout timeout;
* Default: health_check_timeout 5s;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.upstream.hc;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HealthCheckTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public HealthCheckTimeout() {
		super(contexts, "5s", "health_check_timeout");
	}

}
