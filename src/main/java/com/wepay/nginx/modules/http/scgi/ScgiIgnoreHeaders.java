/********************************************************** 
* Syntax: scgi_ignore_headers field ...;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiIgnoreHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiIgnoreHeaders() {
		super(contexts, null, "scgi_ignore_headers");
	}

}
