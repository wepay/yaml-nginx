/********************************************************** 
* Syntax: map_hash_bucket_size size;
* Default: map_hash_bucket_size 32|64|128;
* Context: stream    
**********************************************************/
package com.wepay.nginx.modules.stream.map;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class MapHashBucketSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM);
	}

	public MapHashBucketSize() {
		super(contexts, "32|64|128", "map_hash_bucket_size");
	}

}
