/********************************************************** 
* Syntax: scgi_max_temp_file_size size;
* Default: scgi_max_temp_file_size 1024m;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiMaxTempFileSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiMaxTempFileSize() {
		super(contexts, "1024m", "scgi_max_temp_file_size");
	}

}
