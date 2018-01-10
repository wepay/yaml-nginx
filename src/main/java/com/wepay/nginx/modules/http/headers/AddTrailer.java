/********************************************************** 
* Syntax: add_trailer name value [always];
* Default: —
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.headers;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AddTrailer extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, IF_IN_LOCATION);
	}

	public AddTrailer() {
		super(contexts, null, "add_trailer");
	}

}
