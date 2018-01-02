/********************************************************** 
* Syntax: real_ip_header field | X-Real-IP | X-Forwarded-For | proxy_protocol;
* Default: real_ip_header X-Real-IP;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.realip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RealIpHeader extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public RealIpHeader() {
		super(contexts, "X-Real-IP", "real_ip_header");
	}

}
