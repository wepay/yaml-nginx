/********************************************************** 
* Syntax: scgi_read_timeout time;
* Default: scgi_read_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiReadTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiReadTimeout() {
		super(contexts, "60s", "scgi_read_timeout");
	}

}
