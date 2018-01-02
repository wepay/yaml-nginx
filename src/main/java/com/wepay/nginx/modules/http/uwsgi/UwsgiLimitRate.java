/********************************************************** 
* Syntax: uwsgi_limit_rate rate;
* Default: uwsgi_limit_rate 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiLimitRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiLimitRate() {
		super(contexts, "0", "uwsgi_limit_rate");
	}

}
