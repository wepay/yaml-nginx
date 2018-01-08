/********************************************************** 
* Syntax: include file | mask;
* Default: —
* Context: any    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.Directive;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;

public class Include extends Directive {
	static final List<String> contexts;
	
	@JsonProperty("include")
	private Include include;
	 
	static {
		contexts = Arrays.asList(ANY);
	}
	public Include() {
		super(contexts, null, "include");
	}
	public String dump(int level, String ctx) throws InvalidConditionDirectiveException {
		if(include!=null){
			return include.dump(level, ctx);
		}else{
			return super.dump(level, ctx);
		}
	}

}
