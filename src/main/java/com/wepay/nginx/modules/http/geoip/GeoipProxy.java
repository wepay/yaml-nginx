/********************************************************** 
* Syntax: geoip_proxy address | CIDR;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.geoip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GeoipProxy extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public GeoipProxy() {
		super(contexts, null, "geoip_proxy");
	}

}
