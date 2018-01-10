/********************************************************** 
* Syntax: proxy_buffer size;
* Default: proxy_buffer 4k|8k;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.proxy;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyBuffer extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public ProxyBuffer() {
		super(contexts, "4k|8k", "proxy_buffer");
	}

}
