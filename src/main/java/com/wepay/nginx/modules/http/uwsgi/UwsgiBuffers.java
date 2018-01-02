/********************************************************** 
* Syntax: uwsgi_buffers number size;
* Default: uwsgi_buffers 8 4k|8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiBuffers() {
		super(contexts, "8 4k|8k", "uwsgi_buffers");
	}

}
