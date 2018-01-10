/********************************************************** 
* Syntax: add_after_body uri;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.addition;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AddAfterBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public AddAfterBody() {
		super(contexts, null, "add_after_body");
	}

}
