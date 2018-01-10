/********************************************************** 
* Syntax: http2_body_preread_size size;
* Default: http2_body_preread_size 64k;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2BodyPrereadSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public Http2BodyPrereadSize() {
		super(contexts, "64k", "http2_body_preread_size");
	}

}
