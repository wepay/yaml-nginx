/********************************************************** 
* Syntax: autoindex on | off;
* Default: autoindex off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.autoindex;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Autoindex extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public Autoindex() {
		super(contexts, "off", "autoindex");
	}

}
