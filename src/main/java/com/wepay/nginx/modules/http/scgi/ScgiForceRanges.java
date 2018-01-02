/********************************************************** 
* Syntax: scgi_force_ranges on | off;
* Default: scgi_force_ranges off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiForceRanges extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiForceRanges() {
		super(contexts, "off", "scgi_force_ranges");
	}

}
