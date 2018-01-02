/********************************************************** 
* Syntax: scgi_no_cache string ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiNoCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiNoCache() {
		super(contexts, null, "scgi_no_cache");
	}

}
