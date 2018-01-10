/********************************************************** 
* Syntax: add_header name value [always];
* Default: —
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.headers;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AddHeader extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, IF_IN_LOCATION);
	}

	public AddHeader() {
		super(contexts, null, "add_header");
	}

}
