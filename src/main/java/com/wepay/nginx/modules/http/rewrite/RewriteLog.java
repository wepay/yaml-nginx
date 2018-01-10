/********************************************************** 
* Syntax: rewrite_log on | off;
* Default: rewrite_log off;
* Context: http, server, location, if    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RewriteLog extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, IF);
	}

	public RewriteLog() {
		super(contexts, "off", "rewrite_log");
	}

}
