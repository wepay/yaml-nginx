/********************************************************** 
* Syntax: log_format name [escape=default|json] string ...;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LogFormat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public LogFormat() {
		super(contexts, null, "log_format");
	}

}
