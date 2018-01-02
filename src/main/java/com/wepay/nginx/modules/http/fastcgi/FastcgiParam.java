/********************************************************** 
* Syntax: fastcgi_param parameter value [if_not_empty];
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.fastcgi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Directive;
import com.wepay.nginx.modules.core.Include;

public class FastcgiParam extends Directive {
	static final List<String> contexts;
	@JsonProperty("fastcgi_param")
	private FastcgiParam fastcgiParam;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public FastcgiParam() {
		super(contexts, null, "fastcgi_param");
	}
	public String dump(int level) throws Exception {
		if(fastcgiParam!=null){
			return fastcgiParam.dump(level);
		}else{
			return super.dump(level);
		}
	}
}
