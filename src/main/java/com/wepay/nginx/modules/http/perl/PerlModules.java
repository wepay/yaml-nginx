/********************************************************** 
* Syntax: perl_modules path;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.perl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PerlModules extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public PerlModules() {
		super(contexts, null, "perl_modules");
	}

}
