/********************************************************** 
* Syntax: types_hash_max_size size;
* Default: types_hash_max_size 1024;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class TypesHashMaxSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public TypesHashMaxSize() {
		super(contexts, "1024", "types_hash_max_size");
	}

}
