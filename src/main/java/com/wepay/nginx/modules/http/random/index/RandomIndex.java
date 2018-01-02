/********************************************************** 
* Syntax: random_index on | off;
* Default: random_index off;
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.random.index;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RandomIndex extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public RandomIndex() {
		super(contexts, "off", "random_index");
	}

}
