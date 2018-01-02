/********************************************************** 
* Syntax: sub_filter_types mime-type ...;
* Default: sub_filter_types text/html;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.sub;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SubFilterTypes extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SubFilterTypes() {
		super(contexts, "text/html", "sub_filter_types");
	}

}
