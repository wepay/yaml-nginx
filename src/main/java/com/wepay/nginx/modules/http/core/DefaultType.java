/********************************************************** 
* Syntax: default_type mime-type;
* Default: default_type text/plain;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class DefaultType extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public DefaultType() {
		super(contexts, "text/plain", "default_type");
	}

}
