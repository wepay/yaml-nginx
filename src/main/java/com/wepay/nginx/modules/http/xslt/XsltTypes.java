/********************************************************** 
* Syntax: xslt_types mime-type ...;
* Default: xslt_types text/xml;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.xslt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class XsltTypes extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public XsltTypes() {
		super(contexts, "text/xml", "xslt_types");
	}

}
