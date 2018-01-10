/********************************************************** 
* Syntax: pid file;
* Default: pid logs/nginx.pid;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Pid extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public Pid() {
		super(contexts, "logs/nginx.pid", "pid");
	}

}
