/********************************************************** 
* Syntax: js_content function;
* Default: —
* Context: location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.js;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class JsContent extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION, LIMIT_EXCEPT);
	}

	public JsContent() {
		super(contexts, null, "js_content");
	}

}
