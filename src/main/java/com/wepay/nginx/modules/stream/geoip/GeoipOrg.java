/********************************************************** 
* Syntax: geoip_org file;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.geoip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GeoipOrg extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public GeoipOrg() {
		super(contexts, null, "geoip_org");
	}

}
