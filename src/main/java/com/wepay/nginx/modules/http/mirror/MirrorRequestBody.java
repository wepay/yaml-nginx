/********************************************************** 
* Syntax: mirror_request_body on | off;
* Default: mirror_request_body on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.mirror;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MirrorRequestBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public MirrorRequestBody() {
		super(contexts, "on", "mirror_request_body");
	}

}
