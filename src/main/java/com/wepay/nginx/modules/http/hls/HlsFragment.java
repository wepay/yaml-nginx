/********************************************************** 
* Syntax: hls_fragment time;
* Default: hls_fragment 5s;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.hls;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class HlsFragment extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public HlsFragment() {
		super(contexts, "5s", "hls_fragment");
	}

}
