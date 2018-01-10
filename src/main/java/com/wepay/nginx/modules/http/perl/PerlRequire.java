/********************************************************** 
* Syntax: perl_require module;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.perl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PerlRequire extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public PerlRequire() {
		super(contexts, null, "perl_require");
	}

}
