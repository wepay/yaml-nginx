/********************************************************** 
* Syntax: js_include file;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.js;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class JsInclude extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public JsInclude() {
		super(contexts, null, "js_include");
	}

}
