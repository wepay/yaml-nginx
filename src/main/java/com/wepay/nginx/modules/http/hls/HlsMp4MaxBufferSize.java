/********************************************************** 
* Syntax: hls_mp4_max_buffer_size size;
* Default: hls_mp4_max_buffer_size 10m;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.hls;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HlsMp4MaxBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public HlsMp4MaxBufferSize() {
		super(contexts, "10m", "hls_mp4_max_buffer_size");
	}

}
