/********************************************************** 
* Syntax: proxy_download_rate rate;
* Default: proxy_download_rate 0;
* Context: stream, server    
**********************************************************/
package com.wepay.nginx.modules.stream.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyDownloadRate extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(STREAM, SERVER);
	}

	public ProxyDownloadRate() {
		super(contexts, "0", "proxy_download_rate");
	}

}
