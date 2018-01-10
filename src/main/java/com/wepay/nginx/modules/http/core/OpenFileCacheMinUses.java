/********************************************************** 
* Syntax: open_file_cache_min_uses number;
* Default: open_file_cache_min_uses 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class OpenFileCacheMinUses extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public OpenFileCacheMinUses() {
		super(contexts, "1", "open_file_cache_min_uses");
	}

}
