/********************************************************** 
* Syntax: status;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.status;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Status extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	public Status() {
		super(contexts, null, "status");
	}

}
