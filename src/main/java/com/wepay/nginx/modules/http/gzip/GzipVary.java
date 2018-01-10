/********************************************************** 
* Syntax: gzip_vary on | off;
* Default: gzip_vary off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipVary extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public GzipVary() {
		super(contexts, "off", "gzip_vary");
	}

}
