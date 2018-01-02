/********************************************************** 
* Syntax: ignore_invalid_headers on | off;
* Default: ignore_invalid_headers on;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class IgnoreInvalidHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public IgnoreInvalidHeaders() {
		super(contexts, "on", "ignore_invalid_headers");
	}

}
