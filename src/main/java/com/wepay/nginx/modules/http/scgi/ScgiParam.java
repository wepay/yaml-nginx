/********************************************************** 
* Syntax: scgi_param parameter value [if_not_empty];
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiParam extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiParam() {
		super(contexts, null, "scgi_param");
	}

}
