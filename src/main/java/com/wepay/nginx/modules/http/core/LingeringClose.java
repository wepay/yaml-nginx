/********************************************************** 
* Syntax: lingering_close off | on | always;
* Default: lingering_close on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LingeringClose extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public LingeringClose() {
		super(contexts, "on", "lingering_close");
	}

}
