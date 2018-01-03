package com.wepay.nginx.modules.http.geo;

import static com.wepay.nginx.Constants.*;

import java.util.Arrays;

import com.wepay.nginx.Directive;

public class Default extends Directive {

	public Default() {
		super(Arrays.asList(GEO), null, "default");
	}

}
