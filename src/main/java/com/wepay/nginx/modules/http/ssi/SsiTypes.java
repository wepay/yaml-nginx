/********************************************************** 
* Syntax: ssi_types mime-type ...;
* Default: ssi_types text/html;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.ssi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SsiTypes extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SsiTypes() {
		super(contexts, "text/html", "ssi_types");
	}

}
