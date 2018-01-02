/********************************************************** 
* Syntax: spdy_chunk_size size;
* Default: spdy_chunk_size 8k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.spdy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SpdyChunkSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SpdyChunkSize() {
		super(contexts, "8k", "spdy_chunk_size");
	}

}
