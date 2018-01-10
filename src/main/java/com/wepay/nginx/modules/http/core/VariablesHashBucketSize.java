/********************************************************** 
* Syntax: variables_hash_bucket_size size;
* Default: variables_hash_bucket_size 64;
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class VariablesHashBucketSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}

	public VariablesHashBucketSize() {
		super(contexts, "64", "variables_hash_bucket_size");
	}

}
