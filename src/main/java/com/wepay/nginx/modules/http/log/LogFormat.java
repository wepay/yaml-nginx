/********************************************************** 
* Syntax: log_format name [escape=default|json] string ...;
* Default: log_format combined "...";
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.log;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LogFormat extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public LogFormat() {
		super(contexts, "combined \"...\"", "log_format");
	}

}
