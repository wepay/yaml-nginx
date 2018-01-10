/********************************************************** 
* Syntax: env variable[=value];
* Default: env TZ;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Env extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public Env() {
		super(contexts, "TZ", "env");
	}

}
