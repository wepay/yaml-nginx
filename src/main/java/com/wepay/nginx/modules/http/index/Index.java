/********************************************************** 
* Syntax: index file ...;
* Default: index index.html;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.index;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Index extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public Index() {
		super(contexts, "index.html", "index");
	}

}
