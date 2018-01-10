/********************************************************** 
* Syntax: ssl_preread on | off;
* Default: ssl_preread off;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.ssl.preread;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SslPreread extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public SslPreread() {
		super(contexts, "off", "ssl_preread");
	}

}
