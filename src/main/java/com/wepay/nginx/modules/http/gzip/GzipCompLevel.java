/********************************************************** 
* Syntax: gzip_comp_level level;
* Default: gzip_comp_level 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GzipCompLevel extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public GzipCompLevel() {
		super(contexts, "1", "gzip_comp_level");
	}

}
