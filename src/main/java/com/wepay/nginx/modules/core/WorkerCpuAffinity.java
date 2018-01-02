/********************************************************** 
* Syntax: worker_cpu_affinity cpumask ...;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerCpuAffinity extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public WorkerCpuAffinity() {
		super(contexts, null, "worker_cpu_affinity");
	}

}
