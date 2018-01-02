/********************************************************** 
* Syntax: min_delete_depth number;
* Default: min_delete_depth 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.dav;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MinDeleteDepth extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public MinDeleteDepth() {
		super(contexts, "0", "min_delete_depth");
	}

}
