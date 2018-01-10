/********************************************************** 
* Syntax: scgi_temp_path path [level1 [level2 [level3]]];
* Default: scgi_temp_path scgi_temp;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiTempPath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ScgiTempPath() {
		super(contexts, "scgi_temp", "scgi_temp_path");
	}

}
