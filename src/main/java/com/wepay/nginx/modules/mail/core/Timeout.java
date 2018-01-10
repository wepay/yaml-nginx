/********************************************************** 
* Syntax: timeout time;
* Default: timeout 60s;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Timeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public Timeout() {
		super(contexts, "60s", "timeout");
	}

}
