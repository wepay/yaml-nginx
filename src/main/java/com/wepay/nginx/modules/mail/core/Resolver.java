/********************************************************** 
* Syntax: resolver address ... [valid=time];
* Default: resolver off;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Resolver extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public Resolver() {
		super(contexts, "off", "resolver");
	}

}
