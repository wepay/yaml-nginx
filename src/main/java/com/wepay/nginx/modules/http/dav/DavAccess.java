/********************************************************** 
* Syntax: dav_access users:permissions ...;
* Default: dav_access user:rw;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.dav;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class DavAccess extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public DavAccess() {
		super(contexts, "user:rw", "dav_access");
	}

}
