/********************************************************** 
* Syntax: status_zone zone;
* Default: —
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.http.status;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class StatusZone extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}

	public StatusZone() {
		super(contexts, null, "status_zone");
	}

}
