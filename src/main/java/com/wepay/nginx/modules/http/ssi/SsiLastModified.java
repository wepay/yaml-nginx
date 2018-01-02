/********************************************************** 
* Syntax: ssi_last_modified on | off;
* Default: ssi_last_modified off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.ssi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SsiLastModified extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SsiLastModified() {
		super(contexts, "off", "ssi_last_modified");
	}

}
