/********************************************************** 
* Syntax: ssl_stapling on | off;
* Default: ssl_stapling off;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslStapling extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public SslStapling() {
		super(contexts, "off", "ssl_stapling");
	}

}
