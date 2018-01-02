/********************************************************** 
* Syntax: directio_alignment size;
* Default: directio_alignment 512;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class DirectioAlignment extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public DirectioAlignment() {
		super(contexts, "512", "directio_alignment");
	}

}
