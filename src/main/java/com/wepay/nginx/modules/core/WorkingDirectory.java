/********************************************************** 
* Syntax: working_directory directory;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class WorkingDirectory extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public WorkingDirectory() {
		super(contexts, null, "working_directory");
	}

}
