/********************************************************** 
* Syntax: mp4_limit_rate on | off | factor;
* Default: mp4_limit_rate off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.mp4;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Mp4LimitRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Mp4LimitRate() {
		super(contexts, "off", "mp4_limit_rate");
	}

}
