/********************************************************** 
* Syntax: types_hash_bucket_size size;
* Default: types_hash_bucket_size 64;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class TypesHashBucketSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public TypesHashBucketSize() {
		super(contexts, "64", "types_hash_bucket_size");
	}

}
