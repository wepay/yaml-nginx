/********************************************************** 
* Syntax: xml_entities path;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.xslt;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class XmlEntities extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public XmlEntities() {
		super(contexts, null, "xml_entities");
	}

}
