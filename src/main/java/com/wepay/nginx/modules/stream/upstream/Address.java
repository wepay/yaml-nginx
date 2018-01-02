package com.wepay.nginx.modules.stream.upstream;

import static com.wepay.nginx.Constants.*;

import java.util.Arrays;
import java.util.List;

import com.wepay.nginx.Directive;

public class Address extends Directive {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(SERVER);
	}

	public Address() {
		super(contexts, null, "address");
		// TODO Auto-generated constructor stub
	}

}
