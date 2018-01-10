package com.wepay.nginx.modules.core;

import static com.wepay.nginx.Constants.*;

import java.util.ArrayList;
import java.util.List;

import com.wepay.nginx.Directive;

public class LocationName extends Directive {
	static final List<String> contexts;
	static {
		contexts = new ArrayList<String>();
		contexts.add(LOCATION);
	}

	public LocationName() {
		super(contexts, "/", "location_name");
	}
}
