package com.wepay.nginx.modules.http.geo;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;
import com.wepay.nginx.helper.NginxHelper;

public class Ranges extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(GEO);
	}

	public Ranges() {
		super(contexts, null, "ranges");
	}
	
	@Override
	public String dump(int level, String ctx) {
		String pre = NginxHelper.getSpace(level);
		return pre + SPACE + "ranges;\n";
	}

}