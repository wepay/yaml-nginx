/********************************************************** 
* Syntax: daemon on | off;
* Default: daemon on;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Daemon extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public Daemon() {
		super(contexts, "on", "daemon");
	}

}
