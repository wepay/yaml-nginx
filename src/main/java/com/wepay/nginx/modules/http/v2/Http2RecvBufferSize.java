/********************************************************** 
* Syntax: http2_recv_buffer_size size;
* Default: http2_recv_buffer_size 256k;
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.v2;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Http2RecvBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public Http2RecvBufferSize() {
		super(contexts, "256k", "http2_recv_buffer_size");
	}

}
