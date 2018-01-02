/********************************************************** 
* Syntax: gunzip_buffers number size;
* Default: gunzip_buffers 32 4k|16 8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gunzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GunzipBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public GunzipBuffers() {
		super(contexts, "32 4k|16 8k", "gunzip_buffers");
	}

}
