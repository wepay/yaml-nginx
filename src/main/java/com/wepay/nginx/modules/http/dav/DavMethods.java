/********************************************************** 
* Syntax: dav_methods off | method ...;
* Default: dav_methods off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.dav;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class DavMethods extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public DavMethods() {
		super(contexts, "off", "dav_methods");
	}

}
