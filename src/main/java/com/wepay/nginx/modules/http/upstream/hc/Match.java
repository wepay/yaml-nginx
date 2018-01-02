/********************************************************** 
* Syntax: match name { ... }
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.upstream.hc;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Match extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public Match() {
		super(contexts, null, "match");
	}

}
