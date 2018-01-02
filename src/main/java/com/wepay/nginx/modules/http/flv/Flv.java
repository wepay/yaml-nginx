/********************************************************** 
* Syntax: flv;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.flv;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Flv extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public Flv() {
		super(contexts, null, "flv");
	}

}
