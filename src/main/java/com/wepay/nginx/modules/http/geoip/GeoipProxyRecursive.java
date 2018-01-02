/********************************************************** 
* Syntax: geoip_proxy_recursive on | off;
* Default: geoip_proxy_recursive off;
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.geoip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GeoipProxyRecursive extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public GeoipProxyRecursive() {
		super(contexts, "off", "geoip_proxy_recursive");
	}

}
