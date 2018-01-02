/********************************************************** 
* Syntax: sticky cookie name [expires=time] [domain=domain] [httponly] [secure] [path=path];
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.http.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Sticky extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(UPSTREAM);
	}
	public Sticky() {
		super(contexts, null, "sticky");
	}

}
