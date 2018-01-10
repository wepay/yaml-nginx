package com.wepay.nginx;

import static com.wepay.nginx.Constants.*;

import java.util.ArrayList;
import java.util.List;

public class ConditionStart extends Directive {
	static final List<String> contexts;
	static {
		contexts = new ArrayList<String>();
		contexts.add(LOCATION);
		contexts.add(SERVER);
	}

	public ConditionStart() {
		super(contexts, "", "condition_start");
	}

}
