/********************************************************** 
* Syntax: gzip_proxied off | expired | no-cache | no-store | private | no_last_modified | no_etag | auth | any ...;
* Default: gzip_proxied off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipProxied extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public GzipProxied() {
		super(contexts, "off", "gzip_proxied");
	}

}
