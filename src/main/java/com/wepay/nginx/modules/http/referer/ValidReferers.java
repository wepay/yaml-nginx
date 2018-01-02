/********************************************************** 
* Syntax: valid_referers none | blocked | server_names | string ...;
* Default: —
* Context: server, location    
**********************************************************/
package com.wepay.nginx.modules.http.referer;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ValidReferers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER,LOCATION);
	}
	public ValidReferers() {
		super(contexts, null, "valid_referers");
	}

}
