/********************************************************** 
* Syntax: keyval key $variable zone=name;
* Default: —
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.keyval;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Keyval extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}
	public Keyval() {
		super(contexts, null, "keyval");
	}

}
