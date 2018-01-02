/********************************************************** 
* Syntax: ip_hash;
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.http.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class IpHash extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(UPSTREAM);
	}
	public IpHash() {
		super(contexts, null, "ip_hash");
	}

}
