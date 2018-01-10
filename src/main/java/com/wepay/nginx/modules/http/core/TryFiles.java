/********************************************************** 
* Syntax: try_files file ... uri;
* Default: —
* Context: server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class TryFiles extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER, LOCATION);
	}

	public TryFiles() {
		super(contexts, null, "try_files");
	}

}
