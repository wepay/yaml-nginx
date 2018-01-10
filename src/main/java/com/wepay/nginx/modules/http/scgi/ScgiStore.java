/********************************************************** 
* Syntax: scgi_store on | off | string;
* Default: scgi_store off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiStore extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiStore() {
		super(contexts, "off", "scgi_store");
	}

}
