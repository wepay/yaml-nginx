/********************************************************** 
* Syntax: autoindex_localtime on | off;
* Default: autoindex_localtime off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.autoindex;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AutoindexLocaltime extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public AutoindexLocaltime() {
		super(contexts, "off", "autoindex_localtime");
	}

}
