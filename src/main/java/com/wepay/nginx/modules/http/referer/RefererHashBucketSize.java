/********************************************************** 
* Syntax: referer_hash_bucket_size size;
* Default: referer_hash_bucket_size 64;
* Context: server, location    
**********************************************************/
package com.wepay.nginx.modules.http.referer;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class RefererHashBucketSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(SERVER, LOCATION);
	}

	public RefererHashBucketSize() {
		super(contexts, "64", "referer_hash_bucket_size");
	}

}
