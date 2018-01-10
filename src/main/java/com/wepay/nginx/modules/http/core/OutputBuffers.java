/********************************************************** 
* Syntax: output_buffers number size;
* Default: output_buffers 2 32k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class OutputBuffers extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public OutputBuffers() {
		super(contexts, "2 32k", "output_buffers");
	}

}
