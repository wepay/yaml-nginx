/********************************************************** 
* Syntax: google_perftools_profiles file;
* Default: —
* Context: main    
**********************************************************/
package com.wepay.nginx.modules.google.perftools;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class GooglePerftoolsProfiles extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(MAIN);
	}
	public GooglePerftoolsProfiles() {
		super(contexts, null, "google_perftools_profiles");
	}

}
