/********************************************************** 
* Syntax: scgi_buffering on | off;
* Default: scgi_buffering on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiBuffering extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiBuffering() {
		super(contexts, "on", "scgi_buffering");
	}

}
