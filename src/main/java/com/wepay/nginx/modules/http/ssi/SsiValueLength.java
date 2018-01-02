/********************************************************** 
* Syntax: ssi_value_length length;
* Default: ssi_value_length 256;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.ssi;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class SsiValueLength extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public SsiValueLength() {
		super(contexts, "256", "ssi_value_length");
	}

}
