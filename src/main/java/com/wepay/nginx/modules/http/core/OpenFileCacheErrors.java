/********************************************************** 
* Syntax: open_file_cache_errors on | off;
* Default: open_file_cache_errors off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class OpenFileCacheErrors extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public OpenFileCacheErrors() {
		super(contexts, "off", "open_file_cache_errors");
	}

}
