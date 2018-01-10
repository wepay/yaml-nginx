/********************************************************** 
* Syntax: ssl_stapling_file file;
* Default: —
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.ssl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslStaplingFile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER);
	}

	public SslStaplingFile() {
		super(contexts, null, "ssl_stapling_file");
	}

}
