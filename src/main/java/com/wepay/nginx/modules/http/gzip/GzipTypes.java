/********************************************************** 
* Syntax: gzip_types mime-type ...;
* Default: gzip_types text/html;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipTypes extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public GzipTypes() {
		super(contexts, "text/html", "gzip_types");
	}

}
