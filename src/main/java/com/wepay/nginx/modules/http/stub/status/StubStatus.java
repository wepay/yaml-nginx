/********************************************************** 
* Syntax: stub_status;
* Default: —
* Context: server, location    
**********************************************************/
package com.wepay.nginx.modules.http.stub.status;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class StubStatus extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER,LOCATION);
	}
	public StubStatus() {
		super(contexts, null, "stub_status");
	}

}
