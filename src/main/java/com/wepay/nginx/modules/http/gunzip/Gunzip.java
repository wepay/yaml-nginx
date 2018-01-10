/********************************************************** 
* Syntax: gunzip on | off;
* Default: gunzip off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.gunzip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Gunzip extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public Gunzip() {
		super(contexts, "off", "gunzip");
	}

}
