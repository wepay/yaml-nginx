/********************************************************** 
* Syntax: worker_aio_requests number;
* Default: worker_aio_requests 32;
* Context: events    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerAioRequests extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(EVENTS);
	}
	public WorkerAioRequests() {
		super(contexts, "32", "worker_aio_requests");
	}

}
