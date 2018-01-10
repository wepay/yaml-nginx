/********************************************************** 
* Syntax: mp4_buffer_size size;
* Default: mp4_buffer_size 512K;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.mp4;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Mp4BufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Mp4BufferSize() {
		super(contexts, "512K", "mp4_buffer_size");
	}

}
