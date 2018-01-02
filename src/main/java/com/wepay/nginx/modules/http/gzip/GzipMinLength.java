/********************************************************** 
* Syntax: gzip_min_length length;
* Default: gzip_min_length 20;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipMinLength extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public GzipMinLength() {
		super(contexts, "20", "gzip_min_length");
	}

}
