/********************************************************** 
* Syntax: ssi_min_file_chunk size;
* Default: ssi_min_file_chunk 1k;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.ssi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SsiMinFileChunk extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SsiMinFileChunk() {
		super(contexts, "1k", "ssi_min_file_chunk");
	}

}
