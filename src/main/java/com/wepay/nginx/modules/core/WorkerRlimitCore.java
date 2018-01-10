/********************************************************** 
* Syntax: worker_rlimit_core size;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkerRlimitCore extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public WorkerRlimitCore() {
		super(contexts, null, "worker_rlimit_core");
	}

}
