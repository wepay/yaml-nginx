/********************************************************** 
* Syntax: open_file_cache off;
* Default: open_file_cache off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class OpenFileCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public OpenFileCache() {
		super(contexts, "off", "open_file_cache");
	}

}
