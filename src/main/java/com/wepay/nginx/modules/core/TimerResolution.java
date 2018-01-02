/********************************************************** 
* Syntax: timer_resolution interval;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class TimerResolution extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public TimerResolution() {
		super(contexts, null, "timer_resolution");
	}

}
