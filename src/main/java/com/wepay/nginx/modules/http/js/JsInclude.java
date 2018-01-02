/********************************************************** 
* Syntax: js_include file;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.js;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class JsInclude extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public JsInclude() {
		super(contexts, null, "js_include");
	}

}
