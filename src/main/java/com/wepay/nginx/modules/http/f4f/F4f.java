/********************************************************** 
* Syntax: f4f;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.f4f;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class F4f extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	public F4f() {
		super(contexts, null, "f4f");
	}

}
