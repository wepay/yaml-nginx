/********************************************************** 
* Syntax: max_ranges number;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MaxRanges extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public MaxRanges() {
		super(contexts, null, "max_ranges");
	}

}
