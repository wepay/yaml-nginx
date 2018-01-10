/********************************************************** 
* Syntax: absolute_redirect on | off;
* Default: absolute_redirect on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AbsoluteRedirect extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public AbsoluteRedirect() {
		super(contexts, "on", "absolute_redirect");
	}

}
