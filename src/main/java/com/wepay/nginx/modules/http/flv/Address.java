package com.wepay.nginx.modules.http.flv;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class Address extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(GEO);
	}

	public Address() {
		super(contexts, null, "address");
	}

}