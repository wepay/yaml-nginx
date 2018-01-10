/********************************************************** 
* Syntax: proxy_buffer_size size;
* Default: proxy_buffer_size 16k;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyBufferSize() {
		super(contexts, "16k", "proxy_buffer_size");
	}

}
