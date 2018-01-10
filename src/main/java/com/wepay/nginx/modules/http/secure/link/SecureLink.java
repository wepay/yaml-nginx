/********************************************************** 
* Syntax: secure_link expression;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.secure.link;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SecureLink extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SecureLink() {
		super(contexts, null, "secure_link");
	}

}
