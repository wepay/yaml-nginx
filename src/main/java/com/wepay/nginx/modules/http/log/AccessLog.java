/********************************************************** 
* Syntax: access_log path [format [buffer=size] [gzip[=level]] [flush=time] [if=condition]];
* Default: access_log logs/access.log combined;
* Context: http, server, location, if in location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AccessLog extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION,IF_IN_LOCATION,LIMIT_EXCEPT);
	}
	public AccessLog() {
		super(contexts, "logs/access.log combined", "access_log");
	}

}
