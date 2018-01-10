/********************************************************** 
* Syntax: hls_forward_args on | off;
* Default: hls_forward_args off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.hls;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HlsForwardArgs extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public HlsForwardArgs() {
		super(contexts, "off", "hls_forward_args");
	}

}
