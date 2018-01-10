/********************************************************** 
* Syntax: msie_padding on | off;
* Default: msie_padding on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MsiePadding extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public MsiePadding() {
		super(contexts, "on", "msie_padding");
	}

}
