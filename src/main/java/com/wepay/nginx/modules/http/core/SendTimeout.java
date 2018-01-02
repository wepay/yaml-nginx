/********************************************************** 
* Syntax: send_timeout time;
* Default: send_timeout 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SendTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SendTimeout() {
		super(contexts, "60s", "send_timeout");
	}

}
