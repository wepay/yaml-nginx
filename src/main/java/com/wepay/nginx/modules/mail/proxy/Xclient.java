/********************************************************** 
* Syntax: xclient on | off;
* Default: xclient on;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Xclient extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public Xclient() {
		super(contexts, "on", "xclient");
	}

}
