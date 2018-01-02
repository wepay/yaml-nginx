/********************************************************** 
* Syntax: userid_p3p string | none;
* Default: userid_p3p none;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UseridP3p extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UseridP3p() {
		super(contexts, "none", "userid_p3p");
	}

}
