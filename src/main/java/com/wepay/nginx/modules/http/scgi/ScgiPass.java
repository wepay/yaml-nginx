/********************************************************** 
* Syntax: scgi_pass address;
* Default: —
* Context: location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiPass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION,IF_IN_LOCATION);
	}
	public ScgiPass() {
		super(contexts, null, "scgi_pass");
	}

}
