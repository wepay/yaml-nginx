/********************************************************** 
* Syntax: ancient_browser_value string;
* Default: ancient_browser_value 1;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.browser;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AncientBrowserValue extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public AncientBrowserValue() {
		super(contexts, "1", "ancient_browser_value");
	}

}
