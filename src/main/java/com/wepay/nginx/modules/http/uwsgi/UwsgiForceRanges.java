/********************************************************** 
* Syntax: uwsgi_force_ranges on | off;
* Default: uwsgi_force_ranges off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiForceRanges extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiForceRanges() {
		super(contexts, "off", "uwsgi_force_ranges");
	}

}
