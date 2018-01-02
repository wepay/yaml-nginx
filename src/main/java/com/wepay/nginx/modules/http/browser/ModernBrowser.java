/********************************************************** 
* Syntax: modern_browser browser version;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.browser;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ModernBrowser extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ModernBrowser() {
		super(contexts, null, "modern_browser");
	}

}
