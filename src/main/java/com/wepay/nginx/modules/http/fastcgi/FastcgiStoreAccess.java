/********************************************************** 
* Syntax: fastcgi_store_access users:permissions ...;
* Default: fastcgi_store_access user:rw;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiStoreAccess extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiStoreAccess() {
		super(contexts, "user:rw", "fastcgi_store_access");
	}

}
