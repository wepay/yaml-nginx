/********************************************************** 
* Syntax: autoindex_exact_size on | off;
* Default: autoindex_exact_size on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.autoindex;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AutoindexExactSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public AutoindexExactSize() {
		super(contexts, "on", "autoindex_exact_size");
	}

}
