/********************************************************** 
* Syntax: fastcgi_temp_path path [level1 [level2 [level3]]];
* Default: fastcgi_temp_path fastcgi_temp;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiTempPath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiTempPath() {
		super(contexts, "fastcgi_temp", "fastcgi_temp_path");
	}

}
