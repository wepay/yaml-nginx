/********************************************************** 
* Syntax: starttls on | off | only;
* Default: starttls off;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Starttls extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public Starttls() {
		super(contexts, "off", "starttls");
	}

}
