/********************************************************** 
* Syntax: msie_refresh on | off;
* Default: msie_refresh off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MsieRefresh extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public MsieRefresh() {
		super(contexts, "off", "msie_refresh");
	}

}
