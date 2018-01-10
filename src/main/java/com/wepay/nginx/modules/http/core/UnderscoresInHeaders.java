/********************************************************** 
* Syntax: underscores_in_headers on | off;
* Default: underscores_in_headers off;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UnderscoresInHeaders extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public UnderscoresInHeaders() {
		super(contexts, "off", "underscores_in_headers");
	}

}
