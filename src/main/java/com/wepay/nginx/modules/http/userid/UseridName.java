/********************************************************** 
* Syntax: userid_name name;
* Default: userid_name uid;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UseridName extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UseridName() {
		super(contexts, "uid", "userid_name");
	}

}
