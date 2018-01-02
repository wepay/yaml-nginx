/********************************************************** 
* Syntax: allow address | CIDR | unix: | all;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.access;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Allow extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public Allow() {
		super(contexts, null, "allow");
	}

}
