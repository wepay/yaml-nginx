/********************************************************** 
* Syntax: thread_pool name threads=number [max_queue=number];
* Default: thread_pool default threads=32 max_queue=65536;
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ThreadPool extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}

	public ThreadPool() {
		super(contexts, "default threads=32 max_queue=65536", "thread_pool");
	}

}
