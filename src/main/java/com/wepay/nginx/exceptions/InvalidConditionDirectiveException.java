package com.wepay.nginx.exceptions;

public class InvalidConditionDirectiveException extends InvalidArgumentException {
@Override
	public String getMessage(){
	return "Missing 'condition_end' or empty value supplied. 'condition_start' should have 'condition_end' directive configuration.";
	
}
}
