/********************************************************** 
* Syntax: js_set $variable function;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.js;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class JsSet extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public JsSet() {
		super(contexts, null, "js_set");
	}

}
