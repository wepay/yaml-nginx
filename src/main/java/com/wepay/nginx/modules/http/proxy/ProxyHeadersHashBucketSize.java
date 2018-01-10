/********************************************************** 
* Syntax: proxy_headers_hash_bucket_size size;
* Default: proxy_headers_hash_bucket_size 64;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyHeadersHashBucketSize extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ProxyHeadersHashBucketSize() {
		super(contexts, "64", "proxy_headers_hash_bucket_size");
	}

}
