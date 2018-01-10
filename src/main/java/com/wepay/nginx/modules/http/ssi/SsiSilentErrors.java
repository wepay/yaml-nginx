/********************************************************** 
* Syntax: ssi_silent_errors on | off;
* Default: ssi_silent_errors off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.ssi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SsiSilentErrors extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SsiSilentErrors() {
		super(contexts, "off", "ssi_silent_errors");
	}

}
