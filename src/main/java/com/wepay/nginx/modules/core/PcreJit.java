/********************************************************** 
* Syntax: pcre_jit on | off;
* Default: pcre_jit off;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PcreJit extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public PcreJit() {
		super(contexts, "off", "pcre_jit");
	}

}
