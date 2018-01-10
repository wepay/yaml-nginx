/********************************************************** 
* Syntax: xslt_string_param parameter value;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.xslt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class XsltStringParam extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public XsltStringParam() {
		super(contexts, null, "xslt_string_param");
	}

}
