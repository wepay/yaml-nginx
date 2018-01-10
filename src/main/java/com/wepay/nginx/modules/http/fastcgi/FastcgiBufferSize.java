/********************************************************** 
* Syntax: fastcgi_buffer_size size;
* Default: fastcgi_buffer_size 4k|8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiBufferSize() {
		super(contexts, "4k|8k", "fastcgi_buffer_size");
	}

}
