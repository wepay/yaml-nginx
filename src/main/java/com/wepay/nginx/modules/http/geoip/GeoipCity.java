/********************************************************** 
* Syntax: geoip_city file;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.geoip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GeoipCity extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public GeoipCity() {
		super(contexts, null, "geoip_city");
	}

}
