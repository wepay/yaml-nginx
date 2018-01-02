/********************************************************** 
* Syntax: if (condition) { ... }
* Default: —
* Context: server, location    
**********************************************************/
package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.NamedAbstractContext;

public class If extends NamedAbstractContext {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(SERVER, LOCATION);
	}

	@JsonProperty("condition")
	private Condition condition;
	
	@JsonProperty("break")
	private Break breakO;

	@JsonProperty("return")
	private Return returnO;

	@JsonProperty("rewrite")
	private Rewrite rewrite;
	
	@JsonProperty("rewrites")
	private Rewrites rewrites;

	@JsonProperty("rewrite_log")
	private RewriteLog rewriteLog;

	@JsonProperty("set")
	private SetClass setO;

	@JsonProperty("uninitialized_variable_warn")
	private UninitializedVariableWarn uninitializedVariableWarn;

	public If() {
		super(contexts, null, "if");
	}
	
	public Condition getCondition(){
		return condition;
	}
	@Override
	public void populateMap() {
		Map<String, Dumps> map = getMap();
		//map.clear();

		map.put("rewrites", rewrites);
		map.put("break", breakO);
		map.put("return", returnO);
		map.put("rewrite", rewrite);
		map.put("rewrite_log", rewriteLog);
		map.put("set", setO);
		map.put("uninitialized_variable_warn", uninitializedVariableWarn);

	}
	@Override
	public String getBlockName() {
		return "("+getCondition().getValue()+")";
	}
}
