/********************************************************** 
* Syntax: error_log file [level];
* Default: error_log logs/error.log error;
* Context: main, http, mail, stream, server, location    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ErrorLog extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN,HTTP,MAIL,STREAM,SERVER,LOCATION);
	}
	public ErrorLog() {
		super(contexts, "logs/error.log error", "error_log");
	}

}
