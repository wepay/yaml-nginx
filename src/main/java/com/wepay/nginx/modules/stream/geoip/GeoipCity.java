/********************************************************** 
* Syntax: geoip_city file;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.geoip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GeoipCity extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}
	public GeoipCity() {
		super(contexts, null, "geoip_city");
	}

}
