/********************************************************** 
* Syntax: limit_conn_zone key zone=name:size;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.limit.conn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitConnZone extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public LimitConnZone() {
		super(contexts, null, "limit_conn_zone");
	}

}
