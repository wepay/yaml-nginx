/********************************************************** 
* Syntax: allow address | CIDR | unix: | all;
* Default: —
* Context: http, server, location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.access;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Allow extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION,LIMIT_EXCEPT);
	}
	public Allow() {
		super(contexts, null, "allow");
	}

}
