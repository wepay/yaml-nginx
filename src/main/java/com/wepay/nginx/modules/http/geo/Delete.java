package com.wepay.nginx.modules.http.geo;
 

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Delete extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(GEO);
	}
	public Delete() {
		super(contexts, null, "delete");
	}

}
