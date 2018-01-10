/********************************************************** 
* Syntax: create_full_put_path on | off;
* Default: create_full_put_path off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.dav;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class CreateFullPutPath extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public CreateFullPutPath() {
		super(contexts, "off", "create_full_put_path");
	}

}
