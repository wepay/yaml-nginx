/********************************************************** 
* Syntax: send_lowat size;
* Default: send_lowat 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SendLowat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SendLowat() {
		super(contexts, "0", "send_lowat");
	}

}
