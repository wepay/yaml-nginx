/********************************************************** 
* Syntax: access_log path format [buffer=size] [gzip[=level]] [flush=time] [if=condition];
* Default: access_log off;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AccessLog extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public AccessLog() {
		super(contexts, "off", "access_log");
	}

}
