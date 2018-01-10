/********************************************************** 
* Syntax: session_log name | off;
* Default: session_log off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.session.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SessionLog extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SessionLog() {
		super(contexts, "off", "session_log");
	}

}
