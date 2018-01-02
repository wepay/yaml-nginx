/********************************************************** 
* Syntax: debug_connection address | CIDR | unix:;
* Default: —
* Context: events    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class DebugConnection extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(EVENTS);
	}
	public DebugConnection() {
		super(contexts, null, "debug_connection");
	}

}
