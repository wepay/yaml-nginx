/********************************************************** 
* Syntax: session_log_format name string ...;
* Default: session_log_format combined "...";
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.session.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SessionLogFormat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public SessionLogFormat() {
		super(contexts, "combined \"...\"", "session_log_format");
	}

}
