/********************************************************** 
* Syntax: resolver address ... [valid=time] [ipv6=on|off];
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Resolver extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public Resolver() {
		super(contexts, null, "resolver");
	}

}
