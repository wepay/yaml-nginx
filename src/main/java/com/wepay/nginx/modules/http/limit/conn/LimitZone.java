/********************************************************** 
* Syntax: limit_zone name $variable size;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.limit.conn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitZone extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public LimitZone() {
		super(contexts, null, "limit_zone");
	}

}
