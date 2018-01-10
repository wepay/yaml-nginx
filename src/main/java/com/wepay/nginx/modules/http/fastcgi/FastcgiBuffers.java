/********************************************************** 
* Syntax: fastcgi_buffers number size;
* Default: fastcgi_buffers 8 4k|8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiBuffers() {
		super(contexts, "8 4k|8k", "fastcgi_buffers");
	}

}
