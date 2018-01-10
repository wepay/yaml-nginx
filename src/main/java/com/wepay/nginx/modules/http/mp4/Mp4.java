/********************************************************** 
* Syntax: mp4;
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.mp4;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Mp4 extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	public Mp4() {
		super(contexts, null, "mp4");
	}

}
