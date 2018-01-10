/********************************************************** 
* Syntax: fastcgi_pass address;
* Default: —
* Context: location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiPass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION, IF_IN_LOCATION);
	}

	public FastcgiPass() {
		super(contexts, null, "fastcgi_pass");
	}

}
