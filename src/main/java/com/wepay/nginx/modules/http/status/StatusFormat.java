/********************************************************** 
* Syntax: status_format json;
* Default: status_format json;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.status;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class StatusFormat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public StatusFormat() {
		super(contexts, "json", "status_format");
	}

}
