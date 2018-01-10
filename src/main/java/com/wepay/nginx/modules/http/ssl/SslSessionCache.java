/********************************************************** 
* Syntax: ssl_session_cache off | none | [builtin[:size]] [shared:name:size];
* Default: ssl_session_cache none;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslSessionCache extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslSessionCache() {
		super(contexts, "none", "ssl_session_cache");
	}

}
