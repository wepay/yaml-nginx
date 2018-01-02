/********************************************************** 
* Syntax: merge_slashes on | off;
* Default: merge_slashes on;
* Context: http, server    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MergeSlashes extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER);
	}
	public MergeSlashes() {
		super(contexts, "on", "merge_slashes");
	}

}
