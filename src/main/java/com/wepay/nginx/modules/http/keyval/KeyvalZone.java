/********************************************************** 
* Syntax: keyval_zone zone=name:size [state=file];
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.keyval;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class KeyvalZone extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public KeyvalZone() {
		super(contexts, null, "keyval_zone");
	}

}
