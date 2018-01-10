/********************************************************** 
* Syntax: proxy_buffers number size;
* Default: proxy_buffers 8 4k|8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyBuffers() {
		super(contexts, "8 4k|8k", "proxy_buffers");
	}

}
