/********************************************************** 
* Syntax: uwsgi_temp_path path [level1 [level2 [level3]]];
* Default: uwsgi_temp_path uwsgi_temp;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiTempPath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UwsgiTempPath() {
		super(contexts, "uwsgi_temp", "uwsgi_temp_path");
	}

}
