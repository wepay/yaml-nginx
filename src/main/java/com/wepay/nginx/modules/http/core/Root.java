/********************************************************** 
* Syntax: root path;
* Default: root html;
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Root extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, IF_IN_LOCATION);
	}

	public Root() {
		super(contexts, "html", "root");
	}

}
