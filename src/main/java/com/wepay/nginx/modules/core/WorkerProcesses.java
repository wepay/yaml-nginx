/********************************************************** 
* Syntax: worker_processes number | auto;
* Default: worker_processes 1;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerProcesses extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public WorkerProcesses() {
		super(contexts, "1", "worker_processes");
	}

}
