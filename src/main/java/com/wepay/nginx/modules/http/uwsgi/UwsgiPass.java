/********************************************************** 
* Syntax: uwsgi_pass [protocol://]address;
* Default: —
* Context: location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiPass extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION, IF_IN_LOCATION);
	}

	public UwsgiPass() {
		super(contexts, null, "uwsgi_pass");
	}

}
