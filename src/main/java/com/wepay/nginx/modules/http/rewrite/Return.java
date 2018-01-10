/********************************************************** 
* Syntax: return code [text];
* Default: —
* Context: server, location, if    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Return extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER, LOCATION, IF);
	}

	public Return() {
		super(contexts, null, "return");
	}

}
