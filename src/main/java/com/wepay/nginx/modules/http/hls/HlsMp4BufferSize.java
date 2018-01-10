/********************************************************** 
* Syntax: hls_mp4_buffer_size size;
* Default: hls_mp4_buffer_size 512k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.hls;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HlsMp4BufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public HlsMp4BufferSize() {
		super(contexts, "512k", "hls_mp4_buffer_size");
	}

}
