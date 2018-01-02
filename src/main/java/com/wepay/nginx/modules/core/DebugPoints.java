/********************************************************** 
* Syntax: debug_points abort | stop;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class DebugPoints extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public DebugPoints() {
		super(contexts, null, "debug_points");
	}

}
