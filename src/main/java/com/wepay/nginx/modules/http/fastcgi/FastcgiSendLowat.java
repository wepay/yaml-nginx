/********************************************************** 
* Syntax: fastcgi_send_lowat size;
* Default: fastcgi_send_lowat 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiSendLowat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiSendLowat() {
		super(contexts, "0", "fastcgi_send_lowat");
	}

}
