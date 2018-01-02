/********************************************************** 
* Syntax: server_names_hash_max_size size;
* Default: server_names_hash_max_size 512;
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ServerNamesHashMaxSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public ServerNamesHashMaxSize() {
		super(contexts, "512", "server_names_hash_max_size");
	}

}
