/********************************************************** 
* Syntax: slice size;
* Default: slice 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.slice;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Slice extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public Slice() {
		super(contexts, "0", "slice");
	}

}
