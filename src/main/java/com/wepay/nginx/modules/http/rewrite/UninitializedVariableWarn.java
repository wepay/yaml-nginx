/********************************************************** 
* Syntax: uninitialized_variable_warn on | off;
* Default: uninitialized_variable_warn on;
* Context: http, server, location, if    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UninitializedVariableWarn extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION,IF);
	}
	public UninitializedVariableWarn() {
		super(contexts, "on", "uninitialized_variable_warn");
	}

}
