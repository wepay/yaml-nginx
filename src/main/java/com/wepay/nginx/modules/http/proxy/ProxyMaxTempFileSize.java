/********************************************************** 
* Syntax: proxy_max_temp_file_size size;
* Default: proxy_max_temp_file_size 1024m;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyMaxTempFileSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyMaxTempFileSize() {
		super(contexts, "1024m", "proxy_max_temp_file_size");
	}

}
