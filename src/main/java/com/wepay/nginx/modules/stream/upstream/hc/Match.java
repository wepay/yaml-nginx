/********************************************************** 
* Syntax: match name { ... }
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.upstream.hc;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Match extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}
	public Match() {
		super(contexts, null, "match");
	}

}
