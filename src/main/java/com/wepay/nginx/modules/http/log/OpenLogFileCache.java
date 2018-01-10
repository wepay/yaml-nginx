/********************************************************** 
* Syntax: open_log_file_cache max=N [inactive=time] [min_uses=N] [valid=time];
* Default: open_log_file_cache off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class OpenLogFileCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public OpenLogFileCache() {
		super(contexts, "off", "open_log_file_cache");
	}

}
