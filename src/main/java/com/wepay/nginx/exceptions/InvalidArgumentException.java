package com.wepay.nginx.exceptions;

public class InvalidArgumentException extends Exception {
	public InvalidArgumentException(String msg) {
		super(msg);
	}

	public InvalidArgumentException() {
		super();
	}

	@Override
	public String getMessage() {
		return "Invalid arguments supplied.";
	}
}
