/********************************************************** 
* Syntax: spdy_headers_comp level;
* Default: spdy_headers_comp 0;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.spdy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SpdyHeadersComp extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SpdyHeadersComp() {
		super(contexts, "0", "spdy_headers_comp");
	}

}
