/********************************************************** 
* Syntax: variables_hash_max_size size;
* Default: variables_hash_max_size 1024;
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class VariablesHashMaxSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}
	public VariablesHashMaxSize() {
		super(contexts, "1024", "variables_hash_max_size");
	}

}
