/********************************************************** 
* Syntax: proxy_pass_error_message on | off;
* Default: proxy_pass_error_message off;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyPassErrorMessage extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public ProxyPassErrorMessage() {
		super(contexts, "off", "proxy_pass_error_message");
	}

}
