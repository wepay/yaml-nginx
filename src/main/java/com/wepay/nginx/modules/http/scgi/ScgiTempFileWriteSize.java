/********************************************************** 
* Syntax: scgi_temp_file_write_size size;
* Default: scgi_temp_file_write_size 8k|16k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.scgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ScgiTempFileWriteSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ScgiTempFileWriteSize() {
		super(contexts, "8k|16k", "scgi_temp_file_write_size");
	}

}
