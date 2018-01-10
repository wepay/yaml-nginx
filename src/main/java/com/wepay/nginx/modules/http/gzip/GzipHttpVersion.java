/********************************************************** 
* Syntax: gzip_http_version 1.0 | 1.1;
* Default: gzip_http_version 1.1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipHttpVersion extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public GzipHttpVersion() {
		super(contexts, "1.1", "gzip_http_version");
	}

}
