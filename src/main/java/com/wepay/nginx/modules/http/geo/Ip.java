package com.wepay.nginx.modules.http.geo;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.modules.http.rewrite.MarkerAbstractDirective;

public class Ip extends MarkerAbstractDirective {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(GEO);
	}

	public Ip() {
		super(contexts, null, "ip");
	}

}