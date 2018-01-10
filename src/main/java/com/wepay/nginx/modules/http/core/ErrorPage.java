/********************************************************** 
* Syntax: error_page code ... [=[response]] uri;
* Default: —
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ErrorPage extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, IF_IN_LOCATION);
	}

	public ErrorPage() {
		super(contexts, null, "error_page");
	}

}
