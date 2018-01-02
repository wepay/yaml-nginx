/********************************************************** 
* Syntax: return value;
* Default: —
* Context: server    
**********************************************************/
package com.wepay.nginx.modules.stream.retrn;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Return extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER);
	}
	public Return() {
		super(contexts, null, "return");
	}

}
