/********************************************************** 
* Syntax: uwsgi_max_temp_file_size size;
* Default: uwsgi_max_temp_file_size 1024m;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.uwsgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UwsgiMaxTempFileSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public UwsgiMaxTempFileSize() {
		super(contexts, "1024m", "uwsgi_max_temp_file_size");
	}

}
