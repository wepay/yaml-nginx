/********************************************************** 
* Syntax: multi_accept on | off;
* Default: multi_accept off;
* Context: events    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MultiAccept extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(EVENTS);
	}
	public MultiAccept() {
		super(contexts, "off", "multi_accept");
	}

}
