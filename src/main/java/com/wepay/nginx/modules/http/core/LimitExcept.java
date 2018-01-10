/********************************************************** 
* Syntax: limit_except method ... { ... }
* Default: —
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.IDumps;
import com.wepay.nginx.NamedAbstractContext;
import com.wepay.nginx.modules.http.access.*;
import com.wepay.nginx.modules.http.auth.basic.*;
import com.wepay.nginx.modules.http.js.*;
import com.wepay.nginx.modules.http.log.*;
import com.wepay.nginx.modules.http.perl.*;
import com.wepay.nginx.modules.http.proxy.*;

public class LimitExcept extends NamedAbstractContext {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	@JsonProperty("method")
	private Method method;

	@JsonProperty("access_log")
	private AccessLog accessLog;

	@JsonProperty("allow")
	private Allow allow;

	@JsonProperty("allows")
	private Allows allows;

	@JsonProperty("auth_basic")
	private AuthBasic authBasic;

	@JsonProperty("auth_basic_user_file")
	private AuthBasicUserFile authBasicUserFile;

	@JsonProperty("deny")
	private Deny deny;

	@JsonProperty("denys")
	private Denys denys;

	@JsonProperty("js_content")
	private JsContent jsContent;

	@JsonProperty("perl")
	private Perl perl;

	@JsonProperty("proxy_pass")
	private ProxyPass proxyPass;

	public Method getMethod() {
		return method;
	}

	public LimitExcept() {
		super(contexts, null, "limit_except");
	}

	@Override
	public void populateMap() {
		Map<String, IDumps> map = getMap();
		// map.clear();
		map.put("access_log", accessLog);
		map.put("allow", allow);
		map.put("allows", allows);
		map.put("auth_basic", authBasic);
		map.put("auth_basic_user_file", authBasicUserFile);
		map.put("deny", deny);
		map.put("denys", denys);
		map.put("js_content", jsContent);
		map.put("perl", perl);
		map.put("proxy_pass", proxyPass);
	}

	@Override
	public String getBlockName() {
		return getMethod().getValue();
	}
}
