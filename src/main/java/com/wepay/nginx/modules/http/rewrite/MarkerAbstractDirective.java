package com.wepay.nginx.modules.http.rewrite;

import static com.wepay.nginx.Constants.DIRECTIVE_IP_PRINT_FORMAT;

import java.util.List;

import com.wepay.nginx.Directive;
import com.wepay.nginx.helper.NginxHelper;

public abstract class MarkerAbstractDirective extends Directive{

	public MarkerAbstractDirective(List contexts, String defaultVal, String classAnnotation) {
		super(contexts, defaultVal, classAnnotation);
	}
	
	@Override
	public String dump(int level) throws Exception {
		String pre = NginxHelper.getSpace(level);
		String str = String.format(DIRECTIVE_IP_PRINT_FORMAT, pre, getValue());
		return  updateConditionBlock(level, str);
	}

}
