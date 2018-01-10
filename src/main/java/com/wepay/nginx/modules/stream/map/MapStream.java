/********************************************************** 
* Syntax: map string $variable { ... }
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.map;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MapStream extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public MapStream() {
		super(contexts, null, "map");
	}

}
