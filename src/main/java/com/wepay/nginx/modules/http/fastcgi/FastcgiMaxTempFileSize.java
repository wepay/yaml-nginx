/********************************************************** 
* Syntax: fastcgi_max_temp_file_size size;
* Default: fastcgi_max_temp_file_size 1024m;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiMaxTempFileSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public FastcgiMaxTempFileSize() {
		super(contexts, "1024m", "fastcgi_max_temp_file_size");
	}

}
