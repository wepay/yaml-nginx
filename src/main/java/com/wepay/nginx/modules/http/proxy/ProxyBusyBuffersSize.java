/********************************************************** 
* Syntax: proxy_busy_buffers_size size;
* Default: proxy_busy_buffers_size 8k|16k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyBusyBuffersSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyBusyBuffersSize() {
		super(contexts, "8k|16k", "proxy_busy_buffers_size");
	}

}
