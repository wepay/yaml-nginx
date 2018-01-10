/********************************************************** 
* Syntax: fastcgi_catch_stderr string;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiCatchStderr extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiCatchStderr() {
		super(contexts, null, "fastcgi_catch_stderr");
	}

}
