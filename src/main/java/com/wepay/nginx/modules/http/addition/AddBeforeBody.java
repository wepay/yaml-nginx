/********************************************************** 
* Syntax: add_before_body uri;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.addition;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AddBeforeBody extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public AddBeforeBody() {
		super(contexts, null, "add_before_body");
	}

}
