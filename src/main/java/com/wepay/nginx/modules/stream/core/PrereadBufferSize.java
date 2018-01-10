/********************************************************** 
* Syntax: preread_buffer_size size;
* Default: preread_buffer_size 16k;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PrereadBufferSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public PrereadBufferSize() {
		super(contexts, "16k", "preread_buffer_size");
	}

}
