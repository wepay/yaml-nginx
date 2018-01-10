/********************************************************** 
* Syntax: mp4_limit_rate_after time;
* Default: mp4_limit_rate_after 60s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.mp4;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Mp4LimitRateAfter extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Mp4LimitRateAfter() {
		super(contexts, "60s", "mp4_limit_rate_after");
	}

}
