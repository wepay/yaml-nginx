/********************************************************** 
* Syntax: server address [parameters];
* Default: —
* Context: upstream    
**********************************************************/
package com.wepay.nginx.modules.stream.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Directive;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;

public class Server extends Directive {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(UPSTREAM);
	}
	@JsonProperty("server")
	private Address server;
	 
	public Server() {
		super(contexts, null, "server");
	}
	 
	public String dump(int level) throws InvalidConditionDirectiveException {
		if(server!=null){
			return server.dump(level);
		}else{
			return super.dump(level);
		}
	}

}
