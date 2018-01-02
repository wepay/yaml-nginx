/********************************************************** 
* Syntax: accept_mutex on | off;
* Default: accept_mutex off;
* Context: events    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AcceptMutex extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(EVENTS);
	}
	public AcceptMutex() {
		super(contexts, "off", "accept_mutex");
	}

}
