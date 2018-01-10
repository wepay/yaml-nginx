/********************************************************** 
* Syntax: autoindex_format html | xml | json | jsonp;
* Default: autoindex_format html;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.autoindex;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class AutoindexFormat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public AutoindexFormat() {
		super(contexts, "html", "autoindex_format");
	}

}
