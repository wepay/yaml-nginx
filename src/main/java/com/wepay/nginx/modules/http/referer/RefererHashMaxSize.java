/********************************************************** 
* Syntax: referer_hash_max_size size;
* Default: referer_hash_max_size 2048;
* Context: server, location    
**********************************************************/
package com.wepay.nginx.modules.http.referer;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RefererHashMaxSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER, LOCATION);
	}

	public RefererHashMaxSize() {
		super(contexts, "2048", "referer_hash_max_size");
	}

}
