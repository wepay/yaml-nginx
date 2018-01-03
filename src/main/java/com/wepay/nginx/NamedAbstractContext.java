package com.wepay.nginx;

import static com.wepay.nginx.Constants.NAMED_CONTEXT_PRINT_FORMAT;
import static com.wepay.nginx.Constants.SPACE_COUNT;

import java.util.List;

import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;
import com.wepay.nginx.helper.NginxHelper;

public abstract class NamedAbstractContext extends Context {
	public NamedAbstractContext(List contexts, String defaultVal, String classAnnotation) {
		super(contexts, defaultVal, classAnnotation);
	}

	@Override
	public String dump(int level) throws InvalidConditionDirectiveException{
		String s = super.dump(level + SPACE_COUNT);
		String pre = NginxHelper.getSpace(level);
		return updateConditionBlock(level,
				String.format(NAMED_CONTEXT_PRINT_FORMAT, pre, getClassAnnotation(), getBlockName(), s, pre));
	}

	public abstract String getBlockName();
}
