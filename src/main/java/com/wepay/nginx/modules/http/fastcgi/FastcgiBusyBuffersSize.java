/********************************************************** 
* Syntax: fastcgi_busy_buffers_size size;
* Default: fastcgi_busy_buffers_size 8k|16k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiBusyBuffersSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiBusyBuffersSize() {
		super(contexts, "8k|16k", "fastcgi_busy_buffers_size");
	}

}
