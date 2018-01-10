/********************************************************** 
* Syntax: break;
* Default: —
* Context: server, location, if    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;
import com.wepay.nginx.helper.NginxHelper;

public class Break extends MarkerAbstractDirective {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(SERVER, LOCATION, IF);
	}

	public Break() {
		super(contexts, null, "break");
	}

	@Override
	public String getValue() {
		return "break";
	}

}
