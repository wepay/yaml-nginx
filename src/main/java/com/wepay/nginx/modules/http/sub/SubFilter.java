/********************************************************** 
* Syntax: sub_filter string replacement;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.sub;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SubFilter extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SubFilter() {
		super(contexts, null, "sub_filter");
	}

}
