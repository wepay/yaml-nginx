/********************************************************** 
* Syntax: uwsgi_modifier1 number;
* Default: uwsgi_modifier1 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiModifier1 extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiModifier1() {
		super(contexts, "0", "uwsgi_modifier1");
	}

}
