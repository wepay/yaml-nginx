/********************************************************** 
* Syntax: lingering_time time;
* Default: lingering_time 30s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LingeringTime extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public LingeringTime() {
		super(contexts, "30s", "lingering_time");
	}

}
