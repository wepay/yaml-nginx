/********************************************************** 
* Syntax: real_ip_recursive on | off;
* Default: real_ip_recursive off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.realip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RealIpRecursive extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public RealIpRecursive() {
		super(contexts, "off", "real_ip_recursive");
	}

}
