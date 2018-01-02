/********************************************************** 
* Syntax: accept_mutex_delay time;
* Default: accept_mutex_delay 500ms;
* Context: events    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AcceptMutexDelay extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(EVENTS);
	}
	public AcceptMutexDelay() {
		super(contexts, "500ms", "accept_mutex_delay");
	}

}
