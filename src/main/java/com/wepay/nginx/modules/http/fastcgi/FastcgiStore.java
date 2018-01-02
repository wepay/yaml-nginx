/********************************************************** 
* Syntax: fastcgi_store on | off | string;
* Default: fastcgi_store off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiStore extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiStore() {
		super(contexts, "off", "fastcgi_store");
	}

}
