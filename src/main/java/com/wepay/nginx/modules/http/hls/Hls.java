/********************************************************** 
* Syntax: hls;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.hls;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Hls extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public Hls() {
		super(contexts, null, "hls");
	}

}
