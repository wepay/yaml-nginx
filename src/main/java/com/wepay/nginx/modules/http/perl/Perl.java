/********************************************************** 
* Syntax: perl module::function|'sub { ... }';
* Default: —
* Context: location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.perl;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Perl extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION, LIMIT_EXCEPT);
	}

	public Perl() {
		super(contexts, null, "perl");
	}

}
