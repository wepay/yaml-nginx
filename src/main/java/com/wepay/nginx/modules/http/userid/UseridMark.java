/********************************************************** 
* Syntax: userid_mark letter | digit | = | off;
* Default: userid_mark off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.userid;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class UseridMark extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public UseridMark() {
		super(contexts, "off", "userid_mark");
	}

}
