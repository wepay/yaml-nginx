/********************************************************** 
* Syntax: userid on | v1 | log | off;
* Default: userid off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Userid extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Userid() {
		super(contexts, "off", "userid");
	}

}
