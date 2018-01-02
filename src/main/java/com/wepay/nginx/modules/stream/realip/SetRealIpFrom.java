/********************************************************** 
* Syntax: set_real_ip_from address | CIDR | unix:;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.realip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SetRealIpFrom extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public SetRealIpFrom() {
		super(contexts, null, "set_real_ip_from");
	}

}
