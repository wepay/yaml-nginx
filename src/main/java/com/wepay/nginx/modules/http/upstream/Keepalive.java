/********************************************************** 
* Syntax: keepalive connections;
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.http.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Keepalive extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(UPSTREAM);
	}
	public Keepalive() {
		super(contexts, null, "keepalive");
	}

}
