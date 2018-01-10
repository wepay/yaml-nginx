/********************************************************** 
* Syntax: resolver_timeout time;
* Default: resolver_timeout 30s;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ResolverTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public ResolverTimeout() {
		super(contexts, "30s", "resolver_timeout");
	}

}
