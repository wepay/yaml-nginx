/********************************************************** 
* Syntax: map_hash_max_size size;
* Default: map_hash_max_size 2048;
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.map;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MapHashMaxSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public MapHashMaxSize() {
		super(contexts, "2048", "map_hash_max_size");
	}

}
