/********************************************************** 
* Syntax: secure_link_md5 expression;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.secure.link;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SecureLinkMd5 extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SecureLinkMd5() {
		super(contexts, null, "secure_link_md5");
	}

}
