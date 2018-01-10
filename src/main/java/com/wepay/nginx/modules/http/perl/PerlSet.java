/********************************************************** 
* Syntax: perl_set $variable module::function|'sub { ... }';
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.perl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class PerlSet extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public PerlSet() {
		super(contexts, null, "perl_set");
	}

}
