/********************************************************** 
* Syntax: sendfile on | off;
* Default: sendfile off;
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Sendfile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, IF_IN_LOCATION);
	}

	public Sendfile() {
		super(contexts, "off", "sendfile");
	}

}
