package com.wepay.nginx.modules.http.core;

import static com.wepay.nginx.Constants.*;

import java.util.Arrays;
import java.util.List;

import com.wepay.nginx.Directive;

public class Method extends Directive{
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(LIMIT_EXCEPT);
	}
	public Method() {
		super(contexts, null, null);
		// TODO Auto-generated constructor stub
	}

}
