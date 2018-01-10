/********************************************************** 
* Syntax: least_time connect | first_byte | last_byte [inflight];
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.stream.upstream;

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
