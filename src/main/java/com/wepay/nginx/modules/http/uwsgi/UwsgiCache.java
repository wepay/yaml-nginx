/********************************************************** 
* Syntax: uwsgi_cache zone | off;
* Default: uwsgi_cache off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiCache() {
		super(contexts, "off", "uwsgi_cache");
	}

}
