/********************************************************** 
* Syntax: mirror uri | off;
* Default: mirror off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.mirror;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Mirror extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Mirror() {
		super(contexts, "off", "mirror");
	}

}
