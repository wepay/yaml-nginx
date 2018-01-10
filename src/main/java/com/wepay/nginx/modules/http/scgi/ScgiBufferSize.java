/********************************************************** 
* Syntax: scgi_buffer_size size;
* Default: scgi_buffer_size 4k|8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiBufferSize() {
		super(contexts, "4k|8k", "scgi_buffer_size");
	}

}
