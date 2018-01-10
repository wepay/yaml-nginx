/********************************************************** 
* Syntax: limit_conn_zone key zone=name:size;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.limit.conn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitConnZone extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public LimitConnZone() {
		super(contexts, null, "limit_conn_zone");
	}

}
