/********************************************************** 
* Syntax: reset_timedout_connection on | off;
* Default: reset_timedout_connection off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ResetTimedoutConnection extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ResetTimedoutConnection() {
		super(contexts, "off", "reset_timedout_connection");
	}

}
