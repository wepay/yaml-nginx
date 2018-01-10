/********************************************************** 
* Syntax: disable_symlinks off;
* Default: disable_symlinks off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class DisableSymlinks extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public DisableSymlinks() {
		super(contexts, "off", "disable_symlinks");
	}

}
