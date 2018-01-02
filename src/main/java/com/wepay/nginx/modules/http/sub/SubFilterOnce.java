/********************************************************** 
* Syntax: sub_filter_once on | off;
* Default: sub_filter_once on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.sub;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SubFilterOnce extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SubFilterOnce() {
		super(contexts, "on", "sub_filter_once");
	}

}
