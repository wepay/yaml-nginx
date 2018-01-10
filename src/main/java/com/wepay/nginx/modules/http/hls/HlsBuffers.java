/********************************************************** 
* Syntax: hls_buffers number size;
* Default: hls_buffers 8 2m;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.hls;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HlsBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public HlsBuffers() {
		super(contexts, "8 2m", "hls_buffers");
	}

}
