/********************************************************** 
* Syntax: set $variable value;
* Default: —
* Context: server, location, if    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SetClass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER, LOCATION, IF);
	}

	public SetClass() {
		super(contexts, null, "set");
	}

}
