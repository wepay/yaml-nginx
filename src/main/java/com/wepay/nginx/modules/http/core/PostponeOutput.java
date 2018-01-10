/********************************************************** 
* Syntax: postpone_output size;
* Default: postpone_output 1460;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PostponeOutput extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public PostponeOutput() {
		super(contexts, "1460", "postpone_output");
	}

}
