/********************************************************** 
* Syntax: empty_gif;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.empty.gif;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class EmptyGif extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}
	public EmptyGif() {
		super(contexts, null, "empty_gif");
	}

}
