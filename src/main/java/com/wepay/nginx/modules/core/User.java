/********************************************************** 
* Syntax: user user [group];
* Default: user nobody nobody;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class User extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public User() {
		super(contexts, "nobody nobody", "user");
	}

}
