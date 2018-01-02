/********************************************************** 
* Syntax: js_preread function;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.js;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class JsPreread extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public JsPreread() {
		super(contexts, null, "js_preread");
	}

}
