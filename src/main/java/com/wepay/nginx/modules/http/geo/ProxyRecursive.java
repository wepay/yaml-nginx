package com.wepay.nginx.modules.http.geo;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ProxyRecursive extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(GEO);
	}

	public ProxyRecursive() {
		super(contexts, null, "proxy-recursive");
	}

}