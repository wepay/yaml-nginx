/********************************************************** 
* Syntax: rewrite regex replacement [flag];
* Default: —
* Context: server, location, if    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Directive;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;

public class Rewrite extends Directive {
	static final List<String> contexts;
	@JsonProperty("rewrite")
	private Rewrite rewrite;

	static {
		contexts = Arrays.asList(SERVER, LOCATION, IF);
	}

	public Rewrite() {
		super(contexts, null, "rewrite");
	}

	public String dump(int level) throws InvalidConditionDirectiveException {
		if (rewrite != null) {
			return rewrite.dump(level);
		} else {
			return super.dump(level);
		}
	}
}
