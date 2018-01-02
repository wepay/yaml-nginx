/********************************************************** 
* Syntax: userid_path path;
* Default: userid_path /;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UseridPath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UseridPath() {
		super(contexts, "/", "userid_path");
	}

}
