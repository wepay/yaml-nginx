/********************************************************** 
* Syntax: scgi_next_upstream_tries number;
* Default: scgi_next_upstream_tries 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiNextUpstreamTries extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiNextUpstreamTries() {
		super(contexts, "0", "scgi_next_upstream_tries");
	}

}
