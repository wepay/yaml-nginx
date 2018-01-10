/********************************************************** 
* Syntax: read_ahead size;
* Default: read_ahead 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ReadAhead extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ReadAhead() {
		super(contexts, "0", "read_ahead");
	}

}
