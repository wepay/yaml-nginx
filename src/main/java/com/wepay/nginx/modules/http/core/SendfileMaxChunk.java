/********************************************************** 
* Syntax: sendfile_max_chunk size;
* Default: sendfile_max_chunk 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SendfileMaxChunk extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SendfileMaxChunk() {
		super(contexts, "0", "sendfile_max_chunk");
	}

}
