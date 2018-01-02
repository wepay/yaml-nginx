/********************************************************** 
* Syntax: fastcgi_split_path_info regex;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class FastcgiSplitPathInfo extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public FastcgiSplitPathInfo() {
		super(contexts, null, "fastcgi_split_path_info");
	}

}
