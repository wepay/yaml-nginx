/********************************************************** 
* Syntax: deny address | CIDR | unix: | all;
* Default: —
* Context: http, server, location, limit_except    
**********************************************************/
package com.wepay.nginx.modules.http.access;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Directive;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;

public class Deny extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION, LIMIT_EXCEPT);
	}

	public Deny() {
		super(contexts, null, "deny");
	}

	@JsonProperty("deny")
	private Deny deny;

	public String dump(int level, String ctx) throws InvalidConditionDirectiveException {
		if (deny != null) {
			return deny.dump(level, ctx);
		} else {
			return super.dump(level, ctx);
		}
	}
}
