/********************************************************** 
* Syntax: fastcgi_force_ranges on | off;
* Default: fastcgi_force_ranges off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiForceRanges extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiForceRanges() {
		super(contexts, "off", "fastcgi_force_ranges");
	}

}
