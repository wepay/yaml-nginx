/********************************************************** 
* Syntax: uwsgi_ignore_headers field ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiIgnoreHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiIgnoreHeaders() {
		super(contexts, null, "uwsgi_ignore_headers");
	}

}
