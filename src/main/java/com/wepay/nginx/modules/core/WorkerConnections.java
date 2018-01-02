/********************************************************** 
* Syntax: worker_connections number;
* Default: worker_connections 512;
* Context: events    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerConnections extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(EVENTS);
	}
	public WorkerConnections() {
		super(contexts, "512", "worker_connections");
	}

}
