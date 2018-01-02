/********************************************************** 
* Syntax: split_clients string $variable { ... }
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.split.clients;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SplitClients extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public SplitClients() {
		super(contexts, null, "split_clients");
	}

}
