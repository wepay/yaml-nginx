/********************************************************** 
* Syntax: server_names_hash_bucket_size size;
* Default: server_names_hash_bucket_size 32|64|128;
* Context: http    
**********************************************************/
package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ServerNamesHashBucketSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP);
	}
	public ServerNamesHashBucketSize() {
		super(contexts, "32|64|128", "server_names_hash_bucket_size");
	}

}
