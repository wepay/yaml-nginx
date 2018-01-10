/********************************************************** 
* Syntax: js_access function;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.js;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class JsAccess extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public JsAccess() {
		super(contexts, null, "js_access");
	}

}
