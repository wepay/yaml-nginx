package com.wepay.nginx;

import static com.wepay.nginx.Constants.*;

import java.util.ArrayList;
import java.util.List;

public class ConditionEnd extends Directive {
	static final List<String> contexts;
	static {
		contexts = new ArrayList<String>();
		contexts.add(LOCATION);
		contexts.add(SERVER);
	}

	public ConditionEnd() {
		super(contexts, "", "condition_end");
	}

}
