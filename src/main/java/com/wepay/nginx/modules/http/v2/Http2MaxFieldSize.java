/********************************************************** 
* Syntax: http2_max_field_size size;
* Default: http2_max_field_size 4k;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2MaxFieldSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public Http2MaxFieldSize() {
		super(contexts, "4k", "http2_max_field_size");
	}

}
