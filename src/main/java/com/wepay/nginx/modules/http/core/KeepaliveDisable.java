/********************************************************** 
* Syntax: keepalive_disable none | browser ...;
* Default: keepalive_disable msie6;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class KeepaliveDisable extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public KeepaliveDisable() {
		super(contexts, "msie6", "keepalive_disable");
	}

}
