/********************************************************** 
* Syntax: least_time header | last_byte [inflight];
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.http.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LeastTime extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(UPSTREAM);
	}

	public LeastTime() {
		super(contexts, null, "least_time");
	}

}
