/********************************************************** 
* Syntax: gzip_buffers number size;
* Default: gzip_buffers 32 4k|16 8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public GzipBuffers() {
		super(contexts, "32 4k|16 8k", "gzip_buffers");
	}

}
