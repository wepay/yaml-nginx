/********************************************************** 
* Syntax: lock_file file;
* Default: lock_file logs/nginx.lock;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class LockFile extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public LockFile() {
		super(contexts, "logs/nginx.lock", "lock_file");
	}

}
