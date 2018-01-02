/********************************************************** 
* Syntax: scgi_buffers number size;
* Default: scgi_buffers 8 4k|8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiBuffers() {
		super(contexts, "8 4k|8k", "scgi_buffers");
	}

}
