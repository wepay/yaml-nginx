/********************************************************** 
* Syntax: log_not_found on | off;
* Default: log_not_found on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LogNotFound extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public LogNotFound() {
		super(contexts, "on", "log_not_found");
	}

}
