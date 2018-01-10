/********************************************************** 
* Syntax: imap_client_buffer size;
* Default: imap_client_buffer 4k|8k;
* Context: mail, server    
**********************************************************/
package com.wepay.nginx.modules.mail.imap;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImapClientBuffer extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIL, SERVER);
	}

	public ImapClientBuffer() {
		super(contexts, "4k|8k", "imap_client_buffer");
	}

}
