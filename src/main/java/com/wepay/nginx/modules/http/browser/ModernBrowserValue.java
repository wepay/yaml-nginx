/********************************************************** 
* Syntax: modern_browser_value string;
* Default: modern_browser_value 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.browser;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ModernBrowserValue extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ModernBrowserValue() {
		super(contexts, "1", "modern_browser_value");
	}

}
