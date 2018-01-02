/********************************************************** 
* Syntax: load_module file;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LoadModule extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public LoadModule() {
		super(contexts, null, "load_module");
	}

}
