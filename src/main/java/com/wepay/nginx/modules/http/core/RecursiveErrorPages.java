/********************************************************** 
* Syntax: recursive_error_pages on | off;
* Default: recursive_error_pages off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RecursiveErrorPages extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public RecursiveErrorPages() {
		super(contexts, "off", "recursive_error_pages");
	}

}
