/********************************************************** 
* Syntax: client_body_temp_path path [level1 [level2 [level3]]];
* Default: client_body_temp_path client_body_temp;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ClientBodyTempPath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ClientBodyTempPath() {
		super(contexts, "client_body_temp", "client_body_temp_path");
	}

}
