/********************************************************** 
* Syntax: mp4_max_buffer_size size;
* Default: mp4_max_buffer_size 10M;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.mp4;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Mp4MaxBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Mp4MaxBufferSize() {
		super(contexts, "10M", "mp4_max_buffer_size");
	}

}
