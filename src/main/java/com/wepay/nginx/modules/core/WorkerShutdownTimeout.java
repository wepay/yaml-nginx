/********************************************************** 
* Syntax: worker_shutdown_timeout time;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerShutdownTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public WorkerShutdownTimeout() {
		super(contexts, null, "worker_shutdown_timeout");
	}

}
