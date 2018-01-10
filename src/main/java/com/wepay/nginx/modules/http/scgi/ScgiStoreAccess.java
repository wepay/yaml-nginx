/********************************************************** 
* Syntax: scgi_store_access users:permissions ...;
* Default: scgi_store_access user:rw;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiStoreAccess extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiStoreAccess() {
		super(contexts, "user:rw", "scgi_store_access");
	}

}
