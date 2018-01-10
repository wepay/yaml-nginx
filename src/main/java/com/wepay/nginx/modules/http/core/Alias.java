/********************************************************** 
* Syntax: alias path;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Alias extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	public Alias() {
		super(contexts, null, "alias");
	}

}
