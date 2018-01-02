/********************************************************** 
* Syntax: secure_link_secret word;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.secure.link;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SecureLinkSecret extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public SecureLinkSecret() {
		super(contexts, null, "secure_link_secret");
	}

}
