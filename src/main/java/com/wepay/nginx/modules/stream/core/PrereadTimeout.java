/********************************************************** 
* Syntax: preread_timeout timeout;
* Default: preread_timeout 30s;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PrereadTimeout extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public PrereadTimeout() {
		super(contexts, "30s", "preread_timeout");
	}

}
