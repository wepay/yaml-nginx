/********************************************************** 
* Syntax: keyval key $variable zone=name;
* Default: —
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.keyval;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Keyval extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public Keyval() {
		super(contexts, null, "keyval");
	}

}
