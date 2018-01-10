/********************************************************** 
* Syntax: open_log_file_cache max=N [inactive=time] [min_uses=N] [valid=time];
* Default: open_log_file_cache off;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class OpenLogFileCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public OpenLogFileCache() {
		super(contexts, "off", "open_log_file_cache");
	}

}
