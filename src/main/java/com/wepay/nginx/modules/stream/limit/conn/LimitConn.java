/********************************************************** 
* Syntax: limit_conn zone number;
* Default: —
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.limit.conn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LimitConn extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public LimitConn() {
		super(contexts, null, "limit_conn");
	}

}
