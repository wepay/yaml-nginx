package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.*;

import java.util.Arrays;
import java.util.List;

import com.wepay.nginx.Directive;

public class Condition extends Directive {
	static final List<String> contexts;

	static {
		contexts = Arrays.asList(IF);
	}

	public Condition() {
		super(contexts, null, null);
	}

}
