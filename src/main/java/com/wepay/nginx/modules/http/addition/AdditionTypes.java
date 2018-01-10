/********************************************************** 
* Syntax: addition_types mime-type ...;
* Default: addition_types text/html;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.addition;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AdditionTypes extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public AdditionTypes() {
		super(contexts, "text/html", "addition_types");
	}

}
