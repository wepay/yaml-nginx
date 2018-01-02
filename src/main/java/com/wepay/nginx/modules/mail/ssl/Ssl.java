/********************************************************** 
* Syntax: ssl on | off;
* Default: ssl off;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Ssl extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL,SERVER);
	}
	public Ssl() {
		super(contexts, "off", "ssl");
	}

}
