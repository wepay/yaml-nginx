/********************************************************** 
* Syntax: master_process on | off;
* Default: master_process on;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MasterProcess extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public MasterProcess() {
		super(contexts, "on", "master_process");
	}

}
