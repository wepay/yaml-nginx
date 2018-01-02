/********************************************************** 
* Syntax: uwsgi_store_access users:permissions ...;
* Default: uwsgi_store_access user:rw;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiStoreAccess extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiStoreAccess() {
		super(contexts, "user:rw", "uwsgi_store_access");
	}

}
