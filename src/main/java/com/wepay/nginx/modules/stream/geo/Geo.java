/********************************************************** 
* Syntax: geo [$address] $variable { ... }
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.geo;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Geo extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}
	public Geo() {
		super(contexts, null, "geo");
	}

}
