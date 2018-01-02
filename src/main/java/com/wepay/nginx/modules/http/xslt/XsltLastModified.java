/********************************************************** 
* Syntax: xslt_last_modified on | off;
* Default: xslt_last_modified off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.xslt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class XsltLastModified extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public XsltLastModified() {
		super(contexts, "off", "xslt_last_modified");
	}

}
