/********************************************************** 
* Syntax: userid_domain name | none;
* Default: userid_domain none;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UseridDomain extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UseridDomain() {
		super(contexts, "none", "userid_domain");
	}

}
