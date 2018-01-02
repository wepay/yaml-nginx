/********************************************************** 
* Syntax: geoip_country file;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.geoip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GeoipCountry extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}
	public GeoipCountry() {
		super(contexts, null, "geoip_country");
	}

}
