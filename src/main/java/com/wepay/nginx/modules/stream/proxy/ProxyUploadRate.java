/********************************************************** 
* Syntax: proxy_upload_rate rate;
* Default: proxy_upload_rate 0;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyUploadRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM,SERVER);
	}
	public ProxyUploadRate() {
		super(contexts, "0", "proxy_upload_rate");
	}

}
