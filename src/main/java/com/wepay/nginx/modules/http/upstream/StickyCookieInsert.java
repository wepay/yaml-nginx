/********************************************************** 
* Syntax: sticky_cookie_insert name [expires=time] [domain=domain] [path=path];
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.http.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class StickyCookieInsert extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(UPSTREAM);
	}
	public StickyCookieInsert() {
		super(contexts, null, "sticky_cookie_insert");
	}

}
