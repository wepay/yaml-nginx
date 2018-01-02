/********************************************************** 
* Syntax: http2_chunk_size size;
* Default: http2_chunk_size 8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2ChunkSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public Http2ChunkSize() {
		super(contexts, "8k", "http2_chunk_size");
	}

}
