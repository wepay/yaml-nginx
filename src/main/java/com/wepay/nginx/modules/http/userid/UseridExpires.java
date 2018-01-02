/********************************************************** 
* Syntax: userid_expires time | max | off;
* Default: userid_expires off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UseridExpires extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UseridExpires() {
		super(contexts, "off", "userid_expires");
	}

}
