/********************************************************** 
* Syntax: scgi_bind address [transparent] | off;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiBind extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiBind() {
		super(contexts, null, "scgi_bind");
	}

}
