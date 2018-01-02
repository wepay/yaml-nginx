/********************************************************** 
* Syntax: fastcgi_bind address [transparent] | off;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiBind extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiBind() {
		super(contexts, null, "fastcgi_bind");
	}

}
