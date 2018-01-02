/********************************************************** 
* Syntax: gzip_static on | off | always;
* Default: gzip_static off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip.stat;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipStatic extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public GzipStatic() {
		super(contexts, "off", "gzip_static");
	}

}
