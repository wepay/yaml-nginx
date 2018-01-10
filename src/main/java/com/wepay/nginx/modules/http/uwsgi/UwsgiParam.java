/********************************************************** 
* Syntax: uwsgi_param parameter value [if_not_empty];
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiParam extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiParam() {
		super(contexts, null, "uwsgi_param");
	}

}
