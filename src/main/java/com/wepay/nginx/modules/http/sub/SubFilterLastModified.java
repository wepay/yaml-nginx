/********************************************************** 
* Syntax: sub_filter_last_modified on | off;
* Default: sub_filter_last_modified off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.sub;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SubFilterLastModified extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SubFilterLastModified() {
		super(contexts, "off", "sub_filter_last_modified");
	}

}
