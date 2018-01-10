/********************************************************** 
* Syntax: ssl_buffer_size size;
* Default: ssl_buffer_size 16k;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslBufferSize() {
		super(contexts, "16k", "ssl_buffer_size");
	}

}
