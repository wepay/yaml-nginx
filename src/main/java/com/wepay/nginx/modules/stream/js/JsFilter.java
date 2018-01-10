/********************************************************** 
* Syntax: js_filter function;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.js;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class JsFilter extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public JsFilter() {
		super(contexts, null, "js_filter");
	}

}
