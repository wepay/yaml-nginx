/********************************************************** 
* Syntax: upstream_conf;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.upstream.conf;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UpstreamConf extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public UpstreamConf() {
		super(contexts, null, "upstream_conf");
	}

}
