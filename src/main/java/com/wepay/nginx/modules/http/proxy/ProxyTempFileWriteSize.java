/********************************************************** 
* Syntax: proxy_temp_file_write_size size;
* Default: proxy_temp_file_write_size 8k|16k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyTempFileWriteSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyTempFileWriteSize() {
		super(contexts, "8k|16k", "proxy_temp_file_write_size");
	}

}
