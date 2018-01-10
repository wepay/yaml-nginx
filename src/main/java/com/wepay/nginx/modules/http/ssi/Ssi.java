/********************************************************** 
* Syntax: ssi on | off;
* Default: ssi off;
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.ssi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Ssi extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, IF_IN_LOCATION);
	}

	public Ssi() {
		super(contexts, "off", "ssi");
	}

}
