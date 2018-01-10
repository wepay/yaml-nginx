/********************************************************** 
* Syntax: scgi_hide_header field;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiHideHeader extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiHideHeader() {
		super(contexts, null, "scgi_hide_header");
	}

}
