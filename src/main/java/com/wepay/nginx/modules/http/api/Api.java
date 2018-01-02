/********************************************************** 
* Syntax: api [write=on|off];
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.api;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Api extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public Api() {
		super(contexts, null, "api");
	}

}
