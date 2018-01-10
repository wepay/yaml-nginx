/********************************************************** 
* Syntax: scgi_limit_rate rate;
* Default: scgi_limit_rate 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiLimitRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiLimitRate() {
		super(contexts, "0", "scgi_limit_rate");
	}

}
