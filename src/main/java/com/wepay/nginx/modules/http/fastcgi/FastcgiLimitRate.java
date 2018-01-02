/********************************************************** 
* Syntax: fastcgi_limit_rate rate;
* Default: fastcgi_limit_rate 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiLimitRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiLimitRate() {
		super(contexts, "0", "fastcgi_limit_rate");
	}

}
