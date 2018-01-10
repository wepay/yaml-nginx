/********************************************************** 
* Syntax: lingering_timeout time;
* Default: lingering_timeout 5s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LingeringTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public LingeringTimeout() {
		super(contexts, "5s", "lingering_timeout");
	}

}
