/********************************************************** 
* Syntax: session_log_zone path zone=name:size [format=format] [timeout=time] [id=id] [md5=md5] ;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.session.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SessionLogZone extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public SessionLogZone() {
		super(contexts, null, "session_log_zone");
	}

}
