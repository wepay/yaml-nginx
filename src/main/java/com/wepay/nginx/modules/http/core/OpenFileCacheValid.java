/********************************************************** 
* Syntax: open_file_cache_valid time;
* Default: open_file_cache_valid 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class OpenFileCacheValid extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public OpenFileCacheValid() {
		super(contexts, "60s", "open_file_cache_valid");
	}

}
