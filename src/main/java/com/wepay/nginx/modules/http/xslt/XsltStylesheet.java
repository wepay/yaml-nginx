/********************************************************** 
* Syntax: xslt_stylesheet stylesheet [parameter=value ...];
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.xslt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class XsltStylesheet extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	public XsltStylesheet() {
		super(contexts, null, "xslt_stylesheet");
	}

}
