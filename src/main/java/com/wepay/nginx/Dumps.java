package com.wepay.nginx;

import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;

public interface Dumps<T> {
	public String dump(int level, String context) throws InvalidConditionDirectiveException;
}
