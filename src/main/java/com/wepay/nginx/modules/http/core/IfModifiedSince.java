/********************************************************** 
* Syntax: if_modified_since off | exact | before;
* Default: if_modified_since exact;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class IfModifiedSince extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public IfModifiedSince() {
		super(contexts, "exact", "if_modified_since");
	}

}
