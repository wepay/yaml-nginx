/********************************************************** 
* Syntax: set_real_ip_from address | CIDR | unix:;
* Default: —
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.realip;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;
import com.wepay.nginx.modules.core.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SetRealIpFrom extends Directive {

	@JsonProperty("set_real_ip_from")
	private SetRealIpFrom setRealIpFrom;

	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public SetRealIpFrom() {
		super(contexts, null, "set_real_ip_from");
	}

	public String dump(int level, String ctx) throws InvalidConditionDirectiveException {
		if (setRealIpFrom != null) {
			return setRealIpFrom.dump(level, ctx);
		} else {
			return super.dump(level, ctx);
		}
	}
}
