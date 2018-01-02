/********************************************************** 
* Syntax: scgi_pass_header field;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiPassHeader extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiPassHeader() {
		super(contexts, null, "scgi_pass_header");
	}

}
