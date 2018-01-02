/********************************************************** 
* Syntax: worker_rlimit_nofile number;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerRlimitNofile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public WorkerRlimitNofile() {
		super(contexts, null, "worker_rlimit_nofile");
	}

}
