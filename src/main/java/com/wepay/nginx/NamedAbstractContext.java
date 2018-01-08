package com.wepay.nginx;

import static com.wepay.nginx.Constants.*;

import java.util.List;

import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;
import com.wepay.nginx.helper.NginxHelper;

public abstract class NamedAbstractContext extends Context {

	public NamedAbstractContext(List contexts, String defaultVal, String classAnnotation) {
		super(contexts, defaultVal, classAnnotation);
	}

	@Override
	public String dump(int level, String ctx) throws InvalidConditionDirectiveException {
		if (ctx.equalsIgnoreCase(getClassAnnotation())) {
			return updateComment(level, super.dump(level, ctx));
		}
		String s = super.dump(level + SPACE_COUNT, ctx);
		String pre = NginxHelper.getSpace(level);
		return updateComment(level,
				String.format(NAMED_CONTEXT_PRINT_FORMAT, pre, getClassAnnotation(), getBlockName(), s, pre));

	}

	public abstract String getBlockName();
}
