/********************************************************** 
* Syntax: worker_priority number;
* Default: worker_priority 0;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerPriority extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public WorkerPriority() {
		super(contexts, "0", "worker_priority");
	}

}
