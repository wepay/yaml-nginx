/********************************************************** 
* Syntax: state file;
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.stream.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class State extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(UPSTREAM);
	}
	public State() {
		super(contexts, null, "state");
	}

}
