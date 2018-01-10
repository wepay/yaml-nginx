/********************************************************** 
* Syntax: aio on | off | threads[=pool];
* Default: aio off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Aio extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Aio() {
		super(contexts, "off", "aio");
	}

}
