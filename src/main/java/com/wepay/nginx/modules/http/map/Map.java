/********************************************************** 
* Syntax: map string $variable { ... }
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.map;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Map extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public Map() {
		super(contexts, null, "map");
	}

}
