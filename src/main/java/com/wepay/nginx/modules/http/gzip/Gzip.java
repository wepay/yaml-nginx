/********************************************************** 
* Syntax: gzip on | off;
* Default: gzip off;
* Context: http, server, location, if in location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Gzip extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION,IF_IN_LOCATION);
	}
	public Gzip() {
		super(contexts, "off", "gzip");
	}

}
